package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.ResourceDAO;
import com.tsien.vhr.model.Resource;
import com.tsien.vhr.service.ResourceService;
import com.tsien.vhr.util.UserUtil;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 16:52
 */

@Service
@CacheConfig(cacheNames = "resources_cache")
public class ResourceServiceImpl implements ResourceService {

    @javax.annotation.Resource
    private ResourceDAO resourceDAO;

    /**
     * 查询所有资源
     *
     * @return resources
     */
    @Override
    public List<Resource> listResources() {
        return resourceDAO.listResources();
    }

    @Override
    public List<Resource> listResourcesByUserId() {
        return resourceDAO.listResourcesByUserId(UserUtil.getCurrentUser().getUserId());
    }

    @Override
    public List<Resource> listResourcesTree() {
        return resourceDAO.listResourcesTree();
    }
}
