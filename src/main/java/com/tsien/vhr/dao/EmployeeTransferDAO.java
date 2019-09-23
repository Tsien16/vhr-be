package com.tsien.vhr.dao;

import com.tsien.vhr.model.EmployeeTransfer;

public interface EmployeeTransferDAO {
    int deleteByPrimaryKey(Long transferId);

    int insert(EmployeeTransfer record);

    int insertSelective(EmployeeTransfer record);

    EmployeeTransfer selectByPrimaryKey(Long transferId);

    int updateByPrimaryKeySelective(EmployeeTransfer record);

    int updateByPrimaryKey(EmployeeTransfer record);
}