package com.tsien.vhr.dao;

import com.tsien.vhr.model.ResourceRoleRelation;

public interface ResourceRoleRelationDAO {
    int deleteByPrimaryKey(Long id);

    int insert(ResourceRoleRelation record);

    int insertSelective(ResourceRoleRelation record);

    ResourceRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ResourceRoleRelation record);

    int updateByPrimaryKey(ResourceRoleRelation record);
}