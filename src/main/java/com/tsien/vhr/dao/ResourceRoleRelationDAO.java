package com.tsien.vhr.dao;

import com.tsien.vhr.model.ResourceRoleRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 通过权限ID查询资源ID
     *
     * @param roleId roleId
     * @return resources
     */
    List<Long> listResourceIdsByRoleId(Long roleId);

    /**
     * 通过角色ID删除关联关系
     *
     * @param roleId roleId
     * @return 删除的条数
     */
    int deleteByRoleId(Long roleId);

    /**
     * 插入关联关系
     *
     * @param roleId      roleId
     * @param resourceIds resourceIds
     * @return 插入的行数
     */
    int insertByRoleIdAndResourceIds(@Param("roleId") Long roleId, @Param("resourceIds") Long[] resourceIds);
}