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
     * 查询所有的下级资源，递归
     *
     * @return resources
     */
    List<Resource> listResources();
}