package com.tsien.vhr.dao;

import com.tsien.vhr.model.Salary;

public interface SalaryDAO {
    int deleteByPrimaryKey(Long salaryId);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Long salaryId);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}