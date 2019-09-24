package com.tsien.vhr.dao;

import com.tsien.vhr.model.ResourceRoleRelation;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface ResourceRoleRelationDAO {
    int deleteByPrimaryKey(Long id);

    int insert(ResourceRoleRelation record);

    int insertSelective(ResourceRoleRelation record);

    ResourceRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ResourceRoleRelation record);

    int updateByPrimaryKey(ResourceRoleRelation record);
}