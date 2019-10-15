package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.DepartmentDAO;
import com.tsien.vhr.model.Department;
import com.tsien.vhr.service.DepartmentService;
import com.tsien.vhr.util.ServerResponse;
import com.tsien.vhr.vo.DepartmentVO;
import org.apache.commons.collections4.CollectionUtils;
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

    /**
     * 查询所有的部门
     *
     * @return departmentList
     */
    @Override
    public ServerResponse<List<Department>> listDepartments() {
        return ServerResponse.ok(departmentDAO.listDepartments());
    }

    @Override
    public ServerResponse<List<Department>> listDepartmentsByParentId(Long parentId) {
        return ServerResponse.ok(departmentDAO.listDepartmentsByParentId(parentId));
    }

    /**
     * 根据parentId查询部门树
     *
     * @param parentId parentId
     * @return Department
     */
    @Override
    public ServerResponse<List<DepartmentVO>> listDepartmentTreeByParentId(Long parentId) {

        List<DepartmentVO> departmentVoList = departmentDAO.listDepartmentTreeByParentId(parentId);
        if (departmentVoList == null) {
            return ServerResponse.error("该部门无下级部门，或者该部门不存在");
        }

        return ServerResponse.ok(departmentVoList);
    }

    /**
     * 添加部门
     *
     * @param department department
     * @return department
     */
    @Override
    public ServerResponse<Department> addDepartment(Department department) {

        Integer parentDepartmentLevel = departmentDAO.getParentDepartmentLevelByParentId(department.getParentId());
        if (parentDepartmentLevel == null) {
            return ServerResponse.error("上级部门不存在");
        }
        department.setDepartmentLevel(parentDepartmentLevel + 1);
        department.setEnabled(true);
        department.setDeleted(false);
        department.setChildren(null);
        int resultCount = departmentDAO.insert(department);
        if (resultCount > 0) {
            return ServerResponse.ok(department);
        }

        return ServerResponse.error("添加部门失败");
    }

    /**
     * 删除部门
     *
     * @param departmentId departmentId
     * @return department
     */
    @Override
    public ServerResponse<Department> removeDepartmentById(Long departmentId) {

        Department department = departmentDAO.selectByPrimaryKey(departmentId);
        if (department == null) {
            return ServerResponse.error("参数错误，该部门不存在");
        }

        List<DepartmentVO> departmentVoList = departmentDAO.listDepartmentTreeByParentId(departmentId);
        if (CollectionUtils.isNotEmpty(departmentVoList)) {
            return ServerResponse.error("存在下级部门，不能删除");
        }

        int resultCount = departmentDAO.deleteByPrimaryKey(departmentId);

        if (resultCount > 0) {
            return ServerResponse.ok("删除部门成功", department);
        }

        return ServerResponse.error("删除部门失败");
    }
}
