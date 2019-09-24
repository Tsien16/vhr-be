package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeTransfer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface EmployeeTransferDAO {
    int deleteByPrimaryKey(Long transferId);

    int insert(EmployeeTransfer record);

    int insertSelective(EmployeeTransfer record);

    EmployeeTransfer selectByPrimaryKey(Long transferId);

    int updateByPrimaryKeySelective(EmployeeTransfer record);

    int updateByPrimaryKey(EmployeeTransfer record);
}