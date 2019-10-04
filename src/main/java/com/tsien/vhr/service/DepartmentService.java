package com.tsien.vhr.service;

import com.tsien.vhr.model.Department;
import com.tsien.vhr.util.ServerResponse;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 22:56
 */

public interface DepartmentService {

    /**
     * 根据parentId查询部门
     *
     * @param parentId parentId
     * @return departments
     */
    ServerResponse<List<Department>> listDepartmentsByParentId(Long parentId);
}
