package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeRewardPunishment;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface EmployeeRewardPunishmentDAO {
    int deleteByPrimaryKey(Long rpId);

    int insert(EmployeeRewardPunishment record);

    int insertSelective(EmployeeRewardPunishment record);

    EmployeeRewardPunishment selectByPrimaryKey(Long rpId);

    int updateByPrimaryKeySelective(EmployeeRewardPunishment record);

    int updateByPrimaryKey(EmployeeRewardPunishment record);
}