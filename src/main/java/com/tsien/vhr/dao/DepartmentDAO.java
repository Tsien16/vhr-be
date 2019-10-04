package com.tsien.vhr.dao;

import com.tsien.vhr.model.Department;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface DepartmentDAO {
    int deleteByPrimaryKey(Long departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long departmentId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    /**
     * 根据parentId查询部门
     *
     * @param parentId parentId
     * @return departments
     */
    List<Department> listDepartmentsByParentId(Long parentId);
}