package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeAppraise;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface EmployeeAppraiseDAO {
    int deleteByPrimaryKey(Long appraiseId);

    int insert(EmployeeAppraise record);

    int insertSelective(EmployeeAppraise record);

    EmployeeAppraise selectByPrimaryKey(Long appraiseId);

    int updateByPrimaryKeySelective(EmployeeAppraise record);

    int updateByPrimaryKey(EmployeeAppraise record);
}