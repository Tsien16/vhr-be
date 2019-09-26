package com.tsien.vhr.controller;

import com.github.pagehelper.PageInfo;
import com.tsien.vhr.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/26 0026 19:08
 */

@RestController
@RequestMapping("/employee/basic")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @GetMapping(value = "/emp")
    public PageInfo listEmployees(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "") String keywords,
            Long politicalStatusId, Long nationId, Long positionId,
            Long professionalTitleId, String employmentForm,
            Long departmentId, String positionStartDateScope) {

        return employeeService.listEmployees(pageNum, pageSize, keywords, politicalStatusId, nationId, positionId,
                professionalTitleId, employmentForm, departmentId, positionStartDateScope);
    }
}
