package com.tsien.vhr.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsien.vhr.util.ServerResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * 自定义注销成功时候的返回内容
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/14 0014 2:21
 */

@Configuration
public class MyLogoutSuccessHandler implements LogoutSuccessHandler {

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
}
