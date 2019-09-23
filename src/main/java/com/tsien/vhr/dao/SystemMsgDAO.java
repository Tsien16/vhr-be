package com.tsien.vhr.dao;

import com.tsien.vhr.model.SystemMsg;

public interface SystemMsgDAO {
    int deleteByPrimaryKey(Long msgId);

    int insert(SystemMsg record);

    int insertSelective(SystemMsg record);

    SystemMsg selectByPrimaryKey(Long msgId);

    int updateByPrimaryKeySelective(SystemMsg record);

    int updateByPrimaryKey(SystemMsg record);
}