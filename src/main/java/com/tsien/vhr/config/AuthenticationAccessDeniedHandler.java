package com.tsien.vhr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * 自定义403：权限不足 的响应内容
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 16:35
 */

@Configuration
public class AuthenticationAccessDeniedHandler implements AccessDeniedHandler {
    /**
     * Handles an access denied failure.
     *
     * @param request               that resulted in an <code>AccessDeniedException</code>
     * @param response              so that the user agent can be advised of the failure
     * @param accessDeniedException that caused the invocation
     * @throws IOException      in the event of an IOException
     * @throws ServletException in the event of a ServletException
     */
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {

        response.setStatus(HttpStatus.FORBIDDEN.value());
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write(("{\"status\":\"error\",\"msg\":\"权限不足，请联系管理员!\"}"));
        printWriter.flush();
        printWriter.close();
    }
}
