package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeRewardPunishment;

public interface EmployeeRewardPunishmentDAO {
    int deleteByPrimaryKey(Long rpId);

    int insert(EmployeeRewardPunishment record);

    int insertSelective(EmployeeRewardPunishment record);

    EmployeeRewardPunishment selectByPrimaryKey(Long rpId);

    int updateByPrimaryKeySelective(EmployeeRewardPunishment record);

    int updateByPrimaryKey(EmployeeRewardPunishment record);
}