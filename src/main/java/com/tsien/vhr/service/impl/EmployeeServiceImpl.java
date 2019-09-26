package com.tsien.vhr.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsien.vhr.dao.EmployeeDAO;
import com.tsien.vhr.model.Employee;
import com.tsien.vhr.service.EmployeeService;
import com.tsien.vhr.util.LocalDateUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/26 0026 19:10
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeDAO employeeDAO;

    @Override
    public PageInfo listEmployees(Integer pageNum,
                                  Integer pageSize,
                                  String keywords,
                                  Long politicalStatusId, Long nationId, Long positionId,
                                  Long professionalTitleId, String employmentForm,
                                  Long departmentId, String positionStartDateScope) {

        PageHelper.startPage(pageNum, pageSize);

        LocalDate positionStartDateBegin = null;
        LocalDate positionStartDateEnd = null;

        if (positionStartDateScope != null && positionStartDateScope.contains(",")) {

            positionStartDateBegin = LocalDateUtil.stringToDate(positionStartDateScope.split(",")[0]);
            positionStartDateEnd = LocalDateUtil.stringToDate(positionStartDateScope.split(",")[1]);
        }

        List<Employee> employeeList = employeeDAO.listEmployeesByKeywords(keywords, politicalStatusId, nationId,
                positionId, professionalTitleId, employmentForm, departmentId, positionStartDateBegin,
                positionStartDateEnd);

        return new PageInfo<>(employeeList);

    }
}
