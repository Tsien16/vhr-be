package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.DepartmentDAO;
import com.tsien.vhr.model.Department;
import com.tsien.vhr.service.DepartmentService;
import com.tsien.vhr.util.ServerResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 22:57
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentDAO departmentDAO;

    @Override
    public ServerResponse<List<Department>> listDepartmentsByParentId(Long parentId) {
        return ServerResponse.ok(departmentDAO.listDepartmentsByParentId(parentId));
    }
}
