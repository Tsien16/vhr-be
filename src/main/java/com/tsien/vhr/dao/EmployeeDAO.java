package com.tsien.vhr.dao;

import com.tsien.vhr.model.Employee;

public interface EmployeeDAO {
    int deleteByPrimaryKey(Long employeeId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long employeeId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}