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
}
