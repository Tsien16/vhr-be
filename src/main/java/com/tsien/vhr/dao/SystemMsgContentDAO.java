package com.tsien.vhr.dao;

import com.tsien.vhr.model.SystemMsgContent;

public interface SystemMsgContentDAO {
    int deleteByPrimaryKey(Long msgContentId);

    int insert(SystemMsgContent record);

    int insertSelective(SystemMsgContent record);

    SystemMsgContent selectByPrimaryKey(Long msgContentId);

    int updateByPrimaryKeySelective(SystemMsgContent record);

    int updateByPrimaryKey(SystemMsgContent record);
}