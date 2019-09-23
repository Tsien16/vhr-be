package com.tsien.vhr.dao;

import com.tsien.vhr.model.SystemOplog;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/9 0009 12:35
 */

public interface SystemOplogDAO {
    int deleteByPrimaryKey(Long oplogId);

    int insert(SystemOplog record);

    int insertSelective(SystemOplog record);

    SystemOplog selectByPrimaryKey(Long oplogId);

    int updateByPrimaryKeySelective(SystemOplog record);

    int updateByPrimaryKey(SystemOplog record);
}