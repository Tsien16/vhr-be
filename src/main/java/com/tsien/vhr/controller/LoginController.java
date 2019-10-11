package com.tsien.vhr.controller;

import com.tsien.vhr.util.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Spring Security 如果用户未登录，它会返回个html登录页面
 * 对于前后端分离项目来说，不需要返回html，需要返回Json，告诉前端，需要登录即可
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/11 0011 23:32
 */

@RestController
@RequestMapping("/login_p")
public class LoginController {

    @GetMapping
    public ServerResponse login() {
        return ServerResponse.error("尚未登录，请登录");
    }

}
