package com.tsien.vhr.dao;

import com.tsien.vhr.model.Role;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/9 0009 12:35
 */

public interface RoleDAO {

    /**
     * 根据用户ID查询权限
     *
     * @param userId userId
     * @return roles
     */
    List<Role> listRolesByUserId(Long userId);

    /**
     * 根据用户ID查询权限
     *
     * @param resourceId resourceId
     * @return roles
     */
    List<Role> listRolesByResourceId(Long resourceId);

    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    /**
     * 获取角色
     *
     * @return roleList
     */
    List<Role> listRoles();

    /**
     * 根据角色名称查询角色
     *
     * @param roleName roleName
     * @return role
     */
    Role getRoleByRoleName(String roleName);

    /**
     * 根据角色中文名称查询角色
     *
     * @param chineseName roleName
     * @return role
     */
    Role getRoleByChineseName(String chineseName);
}