package com.tsien.vhr.model;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

@Data
public class EmployeeSalaryRelation {
    /**
    * 员工与薪水关联表ID
    */
    private Long id;

    /**
    * 员工ID
    */
    private Long employeeId;

    /**
    * 薪水ID
    */
    private Long salaryId;
}