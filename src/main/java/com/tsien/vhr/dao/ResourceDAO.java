package com.tsien.vhr.dao;

import com.tsien.vhr.model.Resource;

public interface ResourceDAO {
    int deleteByPrimaryKey(Long resourceId);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long resourceId);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}