package com.tsien.vhr.dao;

import com.tsien.vhr.model.Resource;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface ResourceDAO {

    int deleteByPrimaryKey(Long resourceId);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long resourceId);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    /**
     * 根据parentId 查询下级资源
     *
     * @param parentId parentId
     * @return resources
     */
    List<Resource> listResourcesByParentId(Long parentId);

    /**
     * 查询所有的资源，把Role关联上
     *
     * @return resources
     */
    List<Resource> listResources();

    /**
     * 通过userId查询所有的资源，包括它的下级资源
     * 说明：菜单一共分三级，一级是/，所有的目要，二级是大模块，三级菜单才会有用户权限进行关联，这里查询的是二级、三级菜单
     *
     * @param userId userId
     * @return resources
     */
    List<Resource> listResourcesByUserId(Long userId);

    /**
     * 查询资源树
     *
     * @return resourcesTree
     */
    List<Resource> listResourcesTree();

}