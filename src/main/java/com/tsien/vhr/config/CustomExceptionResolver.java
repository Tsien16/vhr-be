package com.tsien.vhr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 10:55
 */

@Configuration
public class CustomExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        ModelAndView modelAndView = new ModelAndView(new MappingJackson2JsonView());
        Map<String, String> map = new HashMap<>(2);
        map.put("status", "error");
        if (ex instanceof DataIntegrityViolationException) {
            map.put("msg", "该角色尚有关联的资源或用户，删除失败!");
        }
        modelAndView.addObject(map);
        return modelAndView;
    }
}
