package com.tsien.vhr.controller;

import com.tsien.vhr.dao.AreaDAO;
import com.tsien.vhr.dao.ResourceDAO;
import com.tsien.vhr.dao.UserDAO;
import com.tsien.vhr.model.Area;
import com.tsien.vhr.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 18:16
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private ResourceDAO resourceDAO;

    @Resource
    private UserDAO userDAO;

    @Resource
    private AreaDAO areaDAO;

    @GetMapping("/listResourcesByUserId")
    public List<com.tsien.vhr.model.Resource> test() {
        return resourceDAO.listResources();
    }

    @GetMapping
    public User test1() {
        return userDAO.getUserByUsername("libai");
    }

    @GetMapping("/area")
    public List<Area> area(@RequestParam(value = "areaId") Long areaId) {
        return areaDAO.listAreasByAreaId(areaId);
    }


}
