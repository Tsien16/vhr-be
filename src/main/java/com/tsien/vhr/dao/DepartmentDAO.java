package com.tsien.vhr.dao;

import com.tsien.vhr.model.Department;

public interface DepartmentDAO {
    int deleteByPrimaryKey(Long departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long departmentId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}