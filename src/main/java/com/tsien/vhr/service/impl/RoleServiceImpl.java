package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.RoleDAO;
import com.tsien.vhr.model.Role;
import com.tsien.vhr.service.RoleService;
import com.tsien.vhr.util.ServerResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/16 0016 16:05
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDAO roleDAO;

    @Override
    public ServerResponse listRoles() {
        return ServerResponse.ok(roleDAO.listRoles());
    }

    @Override
    public ServerResponse addRole(String roleName, String chineseName) {

        if (StringUtils.isBlank(roleName) || StringUtils.isBlank(chineseName)) {
            return ServerResponse.error("权限中英文名称不能为空");
        }

        if (roleDAO.getRoleByRoleName(roleName) != null) {
            return ServerResponse.error("角色名称已存在，不能重复添加");
        }

        if (roleDAO.getRoleByChineseName(chineseName) != null) {
            return ServerResponse.error("角色中文名称已存在，不能重复添加");
        }

        Role role = new Role();
        role.setRoleName(roleName);
        role.setChineseName(chineseName);
        role.setDeleted(false);

        int resultCount = roleDAO.insertSelective(role);

        if (resultCount > 0) {
            return ServerResponse.ok("新增角色成功");
        }

        return ServerResponse.error("新增角色失败");
    }

    @Override
    public ServerResponse removeRole(Long roleId) {

        int resultCount = roleDAO.deleteByPrimaryKey(roleId);
        if (resultCount > 0) {
            return ServerResponse.ok("删除角色成功");
        }

        return ServerResponse.error("删除角色失败");

    }
}
