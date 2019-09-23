package com.tsien.vhr.model;

import lombok.Data;

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