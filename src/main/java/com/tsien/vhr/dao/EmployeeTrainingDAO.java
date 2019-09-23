package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeTraining;

public interface EmployeeTrainingDAO {
    int deleteByPrimaryKey(Long trainingId);

    int insert(EmployeeTraining record);

    int insertSelective(EmployeeTraining record);

    EmployeeTraining selectByPrimaryKey(Long trainingId);

    int updateByPrimaryKeySelective(EmployeeTraining record);

    int updateByPrimaryKey(EmployeeTraining record);
}