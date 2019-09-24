package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeSalaryRelation;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface EmployeeSalaryRelationDAO {
    int deleteByPrimaryKey(Long id);

    int insert(EmployeeSalaryRelation record);

    int insertSelective(EmployeeSalaryRelation record);

    EmployeeSalaryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmployeeSalaryRelation record);

    int updateByPrimaryKey(EmployeeSalaryRelation record);
}