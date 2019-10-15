package com.tsien.vhr.service;

import com.tsien.vhr.model.Department;
import com.tsien.vhr.util.ServerResponse;
import com.tsien.vhr.vo.DepartmentVO;

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
     * 查询所有的部门
     *
     * @return departmentList
     */
    ServerResponse<List<Department>> listDepartments();

    /**
     * 根据parentId查询部门
     *
     * @param parentId parentId
     * @return departments
     */
    ServerResponse<List<Department>> listDepartmentsByParentId(Long parentId);

    /**
     * 根据parentId查询部门树
     *
     * @param parentId parentId
     * @return Department
     */
    ServerResponse<List<DepartmentVO>> listDepartmentTreeByParentId(Long parentId);

    /**
     * 添加部门
     *
     * @param department department
     * @return department
     */
    ServerResponse<Department> addDepartment(Department department);

    /**
     * 通过ID，删除部门
     *
     * @param departmentId departmentId
     * @return 删除的部门
     */
    ServerResponse<Department> removeDepartmentById(Long departmentId);
}
