package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeTraining;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface EmployeeTrainingDAO {
    int deleteByPrimaryKey(Long trainingId);

    int insert(EmployeeTraining record);

    int insertSelective(EmployeeTraining record);

    EmployeeTraining selectByPrimaryKey(Long trainingId);

    int updateByPrimaryKeySelective(EmployeeTraining record);

    int updateByPrimaryKey(EmployeeTraining record);
}