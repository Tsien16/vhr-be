package com.tsien.vhr.controller;

import com.tsien.vhr.model.Resource;
import com.tsien.vhr.model.User;
import com.tsien.vhr.service.ResourceService;
import com.tsien.vhr.util.UserUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/26 0026 12:51
 */

@RestController
@RequestMapping("/config")
public class ConfigController {

    @javax.annotation.Resource
    private ResourceService resourceService;

    @GetMapping("/userResources")
    public List<Resource> userResources() {
        return resourceService.listResourcesByUserId();
    }

    @GetMapping("/userInfo")
    public User currentUserInfo() {
        return UserUtil.getCurrentUser();
    }
}
