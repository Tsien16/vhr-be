package com.tsien.vhr.dao;

import com.tsien.vhr.model.Salary;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface SalaryDAO {
    int deleteByPrimaryKey(Long salaryId);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Long salaryId);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}