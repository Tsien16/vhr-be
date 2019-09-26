package com.tsien.vhr.service;

import com.tsien.vhr.model.Resource;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 16:51
 */

public interface ResourceService {

    /**
     * 查询所有资源
     *
     * @return resources
     */
    List<Resource> listResources();

    /**
     * 通过userId查询所有的资源，包括它的下级资源
     * 说明：菜单一共分三级，一级是/，所有的目要，二级是大模块，三级菜单才会有用户权限进行关联，这里查询的是二级、三级菜单
     *
     * @return resources
     */
    List<Resource> listResourcesByUserId();

    /**
     * 查询资源树
     *
     * @return resources
     */
    List<Resource> listResourcesTree();
}
