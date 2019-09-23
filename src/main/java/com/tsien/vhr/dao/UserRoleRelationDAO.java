package com.tsien.vhr.dao;

import com.tsien.vhr.model.UserRoleRelation;

public interface UserRoleRelationDAO {
    int deleteByPrimaryKey(Long id);

    int insert(UserRoleRelation record);

    int insertSelective(UserRoleRelation record);

    UserRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRoleRelation record);

    int updateByPrimaryKey(UserRoleRelation record);
}