package com.tsien.vhr.service;

import com.tsien.vhr.util.ServerResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/16 0016 16:05
 */

public interface RoleService {

    /**
     * 获取所有的角色
     *
     * @return roleList
     */
    ServerResponse listRoles();

    /**
     * 增加权限
     *
     * @param roleName    roleName
     * @param chineseName chineseName
     * @return 增加的结果
     */
    ServerResponse addRole(String roleName, String chineseName);

    /**
     * 删除权限
     *
     * @param roleId roleId
     * @return 删除的结果
     */
    ServerResponse removeRole(Long roleId);
}
