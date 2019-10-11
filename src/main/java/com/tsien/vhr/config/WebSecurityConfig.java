package com.tsien.vhr.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsien.vhr.constant.UrlEnum;
import com.tsien.vhr.service.UserService;
import com.tsien.vhr.util.ServerResponse;
import com.tsien.vhr.util.UserUtil;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 18:03
 */

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private UserService userService;

    @Resource
    private UrlFilterInvocationSecurityMetadataSource urlFilterInvocationSecurityMetadataSource;

    @Resource
    private UrlAccessDecisionManager urlAccessDecisionManager;

    @Resource
    private AuthenticationAccessDeniedHandler authenticationAccessDeniedHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/index.html", "/static/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
                    @Override
                    public <O extends FilterSecurityInterceptor> O postProcess(O object) {
                        object.setSecurityMetadataSource(urlFilterInvocationSecurityMetadataSource);
                        object.setAccessDecisionManager(urlAccessDecisionManager);
                        return object;
                    }
                })
                .and()
                .formLogin()
                .loginPage(UrlEnum.LOGIN_URL.getUrl())
                .loginProcessingUrl(UrlEnum.Login_Processing_Url.getUrl())
                .usernameParameter("username")
                .passwordParameter("password")
                .permitAll()
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                                        Authentication authentication) throws IOException,
                            ServletException {
                        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
                        PrintWriter printWriter = response.getWriter();
                        printWriter.write(new ObjectMapper().writeValueAsString(ServerResponse.ok("登录成功",
                                UserUtil.getCurrentUser())));
                        printWriter.flush();
                        printWriter.close();
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                                        AuthenticationException exception) throws IOException,
                            ServletException {
                        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
                        PrintWriter printWriter = response.getWriter();
                        String errorMsg = "";
                        if (exception instanceof UsernameNotFoundException || exception instanceof BadCredentialsException) {
                            errorMsg = "用户名或密码输入错误，登录失败!";
                        } else if (exception instanceof DisabledException) {
                            errorMsg = "账户被禁用，登录失败，请联系管理员!";
                        } else {
                            errorMsg = "登录失败!";
                        }
                        printWriter.write(new ObjectMapper().writeValueAsString(ServerResponse.error(errorMsg)));
                        printWriter.flush();
                        printWriter.close();
                    }
                })
                .and()
                .logout()
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                                                Authentication authentication) throws IOException, ServletException {
                        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
                        PrintWriter printWriter = response.getWriter();
                        ObjectMapper objectMapper = new ObjectMapper();
                        printWriter.write(objectMapper.writeValueAsString(ServerResponse.ok("注销成功")));
                        printWriter.flush();
                        printWriter.close();
                    }
                })
                .permitAll()
                .and().csrf().disable().exceptionHandling().accessDeniedHandler(authenticationAccessDeniedHandler);
    }
}
