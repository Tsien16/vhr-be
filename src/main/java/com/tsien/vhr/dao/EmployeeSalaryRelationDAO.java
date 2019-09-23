package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeSalaryRelation;

public interface EmployeeSalaryRelationDAO {
    int deleteByPrimaryKey(Long id);

    int insert(EmployeeSalaryRelation record);

    int insertSelective(EmployeeSalaryRelation record);

    EmployeeSalaryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmployeeSalaryRelation record);

    int updateByPrimaryKey(EmployeeSalaryRelation record);
}