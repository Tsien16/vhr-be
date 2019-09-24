package com.tsien.vhr.dao;

import com.tsien.vhr.model.SalaryAdjustment;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface SalaryAdjustmentDAO {
    int deleteByPrimaryKey(Long adjustmentId);

    int insert(SalaryAdjustment record);

    int insertSelective(SalaryAdjustment record);

    SalaryAdjustment selectByPrimaryKey(Long adjustmentId);

    int updateByPrimaryKeySelective(SalaryAdjustment record);

    int updateByPrimaryKey(SalaryAdjustment record);
}