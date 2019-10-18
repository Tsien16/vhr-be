package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.ResourceRoleRelationDAO;
import com.tsien.vhr.service.ResourceRoleRelationService;
import com.tsien.vhr.util.ServerResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/26 0026 12:40
 */

@Service
public class ResourceRoleRelationServiceImpl implements ResourceRoleRelationService {

    @Resource
    private ResourceRoleRelationDAO resourceRoleRelationDAO;

    /**
     * 通过权限ID查询资源ID
     *
     * @param roleId roleId
     * @return resources
     */
    @Override
    public List<Long> listResourceIdsByRoleId(Long roleId) {
        return resourceRoleRelationDAO.listResourceIdsByRoleId(roleId);
    }

    @Override
    public ServerResponse updateResourceRole(Long roleId, Long[] resourceIds) {
        resourceRoleRelationDAO.deleteByRoleId(roleId);
        if (resourceIds.length == 0) {
            return ServerResponse.ok("resourceIds为空");
        }
        int resultCount = resourceRoleRelationDAO.insertByRoleIdAndResourceIds(roleId, resourceIds);
        if (resultCount > 0) {
            return ServerResponse.ok("添加成功");
        }
        return ServerResponse.error("添加失败");
    }
}
