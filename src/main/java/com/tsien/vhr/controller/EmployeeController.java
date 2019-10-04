package com.tsien.vhr.controller;

import com.github.pagehelper.PageInfo;
import com.tsien.vhr.model.Employee;
import com.tsien.vhr.service.*;
import com.tsien.vhr.util.EmailUtil;
import com.tsien.vhr.util.ServerResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.TemplateEngine;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

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

    @Resource
    private NationService nationService;

    @Resource
    private PoliticalStatusService politicalStatusService;

    @Resource
    private DepartmentService departmentService;

    @Resource
    private PositionService positionService;

    @Resource
    private ProfessionalTitleService professionalTitleService;

    private ExecutorService executorService;

    @Resource
    private TemplateEngine templateEngine;

    @Resource
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String emailAddress;

    @GetMapping(value = "/emp")
    public ServerResponse<PageInfo> listEmployees(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "keywords", defaultValue = "") String keywords,
            Long politicalStatusId, Long nationId, Long positionId,
            Long professionalTitleId, String employmentForm,
            Long departmentId, String positionStartDateScope) {

        return employeeService.listEmployees(pageNum, pageSize, keywords, politicalStatusId, nationId, positionId,
                professionalTitleId, employmentForm, departmentId, positionStartDateScope);
    }


    @PostMapping(value = "/emp")
    public ServerResponse addEmployee(Employee employee) {
        ServerResponse serverResponse = employeeService.insertEmployee(employee);
        if (serverResponse.isSuccess()) {
            executorService.execute(new EmailUtil(employee, javaMailSender, templateEngine, emailAddress));
        }
        return serverResponse;
    }

    @GetMapping(value = "/employee_dict")
    public ServerResponse listEmployeeDict() {

        Map<String, Object> map = new HashMap<>(6);
        map.put("nationList", nationService.listNations().getData());
        map.put("politicalStatusList", politicalStatusService.listPoliticalStatus().getData());
        map.put("departmentList", departmentService.listDepartmentsByParentId(0L).getData());
        map.put("positionList", positionService.listPositions().getData());
        map.put("professionalTitleList", professionalTitleService.listProfessionalTitles().getData());
        map.put("workNumber", String.format("%08d", employeeService.getMaxWorkNumber() + 1));
        return ServerResponse.ok(map);
    }

    @GetMapping("/maxWorkNumber")
    public String maxWorkNumber() {
        return String.format("%08d", employeeService.getMaxWorkNumber() + 1);
    }
}
