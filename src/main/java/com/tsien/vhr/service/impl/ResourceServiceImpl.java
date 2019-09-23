package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.ResourceDAO;
import com.tsien.vhr.model.Resource;
import com.tsien.vhr.service.ResourceService;
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
}
