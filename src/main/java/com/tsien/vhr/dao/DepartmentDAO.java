package com.tsien.vhr.dao;

import com.tsien.vhr.model.Department;
import com.tsien.vhr.vo.DepartmentVO;

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
     * 查询所有的部门
     *
     * @return departmentList
     */
    List<Department> listDepartments();

    /**
     * 根据parentId查询部门
     *
     * @param parentId parentId
     * @return departments
     */
    List<Department> listDepartmentsByParentId(Long parentId);

    /**
     * 根据parentId查询部门树
     *
     * @param parentId parentId
     * @return 部门树
     */
    List<DepartmentVO> listDepartmentTreeByParentId(Long parentId);

    /**
     * 根据当前部门的parentId，查询上级部门的级别
     *
     * @param parentId parentId
     * @return departmentLevel
     */
    Integer getParentDepartmentLevelByParentId(Long parentId);
}