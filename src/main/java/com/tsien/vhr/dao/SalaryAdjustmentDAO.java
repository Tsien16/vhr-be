package com.tsien.vhr.dao;

import com.tsien.vhr.model.SalaryAdjustment;

public interface SalaryAdjustmentDAO {
    int deleteByPrimaryKey(Long adjustmentId);

    int insert(SalaryAdjustment record);

    int insertSelective(SalaryAdjustment record);

    SalaryAdjustment selectByPrimaryKey(Long adjustmentId);

    int updateByPrimaryKeySelective(SalaryAdjustment record);

    int updateByPrimaryKey(SalaryAdjustment record);
}