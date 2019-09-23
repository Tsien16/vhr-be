package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeAppraise;

public interface EmployeeAppraiseDAO {
    int deleteByPrimaryKey(Long appraiseId);

    int insert(EmployeeAppraise record);

    int insertSelective(EmployeeAppraise record);

    EmployeeAppraise selectByPrimaryKey(Long appraiseId);

    int updateByPrimaryKeySelective(EmployeeAppraise record);

    int updateByPrimaryKey(EmployeeAppraise record);
}