package com.tsien.vhr.service;

import com.tsien.vhr.util.ServerResponse;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/26 0026 12:40
 */

public interface ResourceRoleRelationService {

    /**
     * 通过权限ID查询资源ID
     *
     * @param roleId roleId
     * @return resources
     */
    List<Long> listResourceIdsByRoleId(Long roleId);

    /**
     * 更新资源与角色的关系
     *
     * @param roleId         roleId
     * @param resourceIdList resourceIdList
     * @return 更新的结果
     */
    ServerResponse updateResourceRole(Long roleId, Long[] resourceIdList);
}
