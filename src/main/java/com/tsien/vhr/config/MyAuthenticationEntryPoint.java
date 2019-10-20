package com.tsien.vhr.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsien.vhr.util.ServerResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * 自定义请求失败的时候，是重定向还是返回错误信息
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/14 0014 3:02
 */

@Configuration
public class MyAuthenticationEntryPoint implements AuthenticationEntryPoint {

    /**
     * Commences an authentication scheme.
     * <p>
     * <code>ExceptionTranslationFilter</code> will populate the <code>HttpSession</code>
     * attribute named
     * <code>AbstractAuthenticationProcessingFilter.SPRING_SECURITY_SAVED_REQUEST_KEY</code>
     * with the requested target URL before calling this method.
     * <p>
     * Implementations should modify the headers on the <code>ServletResponse</code> as
     * necessary to commence the authentication process.
     *
     * @param request       that resulted in an <code>AuthenticationException</code>
     * @param response      so that the user agent can begin authentication
     * @param authException that caused the invocation
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {

        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        PrintWriter printWriter = response.getWriter();
        String errorMsg = "";

        // InsufficientAuthenticationException 认证信息不全异常
        if (authException instanceof InsufficientAuthenticationException) {
            errorMsg = "请求失败，请联系管理员";
        } else {
            errorMsg = "访问失败!";
        }
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        printWriter.write(new ObjectMapper().writeValueAsString(ServerResponse.error(errorMsg)));
        printWriter.flush();
        printWriter.close();
    }
}
