package com.tsien.vhr.dao;

import com.tsien.vhr.model.SystemMsgContent;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface SystemMsgContentDAO {
    int deleteByPrimaryKey(Long msgContentId);

    int insert(SystemMsgContent record);

    int insertSelective(SystemMsgContent record);

    SystemMsgContent selectByPrimaryKey(Long msgContentId);

    int updateByPrimaryKeySelective(SystemMsgContent record);

    int updateByPrimaryKey(SystemMsgContent record);
}