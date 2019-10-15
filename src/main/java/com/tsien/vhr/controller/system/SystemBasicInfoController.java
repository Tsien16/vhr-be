package com.tsien.vhr.controller.system;

import com.tsien.vhr.model.Department;
import com.tsien.vhr.service.DepartmentService;
import com.tsien.vhr.util.ServerResponse;
import com.tsien.vhr.vo.DepartmentVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/15 0015 15:30
 */

@RestController
@RequestMapping("/system/basicInfo")
public class SystemBasicInfoController {

    @Resource
    private DepartmentService departmentService;

    /**
     * 根据parentId查询部门树
     * 前台无法直接传Long类型数值，需要在后端进行转换
     *
     * @param parentId parentId
     * @return 部门树
     */
    @GetMapping("departmentTree")
    public ServerResponse<List<DepartmentVO>> listDepartmentTreeByParentId(
            @RequestParam(value = "parentId", defaultValue = "0") String parentId) {

        return departmentService.listDepartmentTreeByParentId(Long.valueOf(parentId));
    }

    /**
     * 查询所有的部门
     *
     * @return departments
     */
    @GetMapping("department")
    public ServerResponse<List<Department>> listDepartments() {

        return departmentService.listDepartments();
    }

    /**
     * 添加部门
     *
     * @param department department
     * @return 添加的结果
     */
    @PostMapping(value = "department")
    public ServerResponse<Department> addDepartment(Department department) {
        return departmentService.addDepartment(department);
    }

    /**
     * 删除部门
     *
     * @param departmentId departmentId
     * @return 删除的结果
     */
    @DeleteMapping(value = "department")
    public ServerResponse<Department> deleteDepartment(@RequestParam(value = "departmentId", required = true) String departmentId) {
        return departmentService.removeDepartmentById(Long.valueOf(departmentId));
    }

}
