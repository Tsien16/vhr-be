package com.tsien.vhr.service;

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
}
