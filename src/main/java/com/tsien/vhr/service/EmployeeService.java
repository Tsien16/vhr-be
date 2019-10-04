package com.tsien.vhr.service;

import com.github.pagehelper.PageInfo;
import com.tsien.vhr.model.Employee;
import com.tsien.vhr.util.ServerResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/26 0026 19:10
 */

public interface EmployeeService {

    /**
     * 根据各种参数查询员工
     *
     * @param pageNum                pageNum
     * @param pageSize               pageSize
     * @param keywords               keywords
     * @param politicalStatusId      politicalStatusId
     * @param nationId               nationId
     * @param positionId             positionId
     * @param professionalTitleId    professionalTitleId
     * @param employmentForm         employmentForm
     * @param departmentId           departmentId
     * @param positionStartDateScope positionStartDateScope
     * @return employees
     */
    ServerResponse<PageInfo> listEmployees(Integer pageNum,
                                           Integer pageSize,
                                           String keywords,
                                           Long politicalStatusId, Long nationId, Long positionId,
                                           Long professionalTitleId, String employmentForm,
                                           Long departmentId, String positionStartDateScope);

    /**
     * 新增员工资料
     *
     * @param employee employee
     * @return serverResponse
     */
    ServerResponse insertEmployee(Employee employee);

    /**
     * 查询当前的最大工号
     *
     * @return maxWorkNumber
     */
    Long getMaxWorkNumber();
}
