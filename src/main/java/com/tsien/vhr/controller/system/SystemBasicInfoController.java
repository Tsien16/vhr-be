package com.tsien.vhr.controller.system;

import com.tsien.vhr.model.Department;
import com.tsien.vhr.model.Position;
import com.tsien.vhr.model.ProfessionalTitle;
import com.tsien.vhr.service.*;
import com.tsien.vhr.util.ServerResponse;
import com.tsien.vhr.vo.DepartmentVO;
import com.tsien.vhr.vo.ResourceVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Resource
    private PositionService positionService;

    @Resource
    private ProfessionalTitleService professionalTitleService;

    @Resource
    private RoleService roleService;

    @Resource
    private ResourceService resourceService;

    @Resource
    private ResourceRoleRelationService resourceRoleRelationService;

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

    /**
     * 查询所有的职位
     *
     * @return positions
     */
    @GetMapping("position")
    public ServerResponse<List<Position>> listPositions() {
        return positionService.listPositions();
    }

    /**
     * 添加职位
     *
     * @return positions
     */
    @PostMapping("position")
    public ServerResponse addPosition(@RequestParam(value = "name") String positionName) {

        return positionService.addPosition(positionName);
    }

    /**
     * 根据id删除职位
     *
     * @param ids ids
     * @return 删除的结果
     */
    @DeleteMapping("position")
    public ServerResponse removePositions(@RequestParam(value = "ids") String ids) {
        return positionService.deletePositionsByIds(ids);
    }

    /**
     * 更新职位
     *
     * @param positionId   positionId
     * @param positionName positionName
     * @return 更新的结果
     */
    @PutMapping("position")
    public ServerResponse updatePosition(@RequestParam(value = "updateId") String positionId,
                                         @RequestParam(value = "updateName") String positionName) {

        return positionService.updatePositionById(Long.valueOf(positionId), positionName);
    }

    /**
     * 查询所有的职称
     *
     * @return professionalTitles
     */
    @GetMapping("professionalTitle")
    public ServerResponse<List<ProfessionalTitle>> listProfessionalTitles() {
        return professionalTitleService.listProfessionalTitles();
    }

    /**
     * 添加职称
     *
     * @return professionalTitles
     */
    @PostMapping("professionalTitle")
    public ServerResponse addProfessionalTitle(@RequestParam(value = "name") String professionalTitleName,
                                               @RequestParam(value = "professionalTitleLevel") String professionalTitleLevel) {
        return professionalTitleService.addProfessionalTitle(professionalTitleName, professionalTitleLevel);
    }

    /**
     * 根据id删除职称
     *
     * @param ids ids
     * @return 删除的结果
     */
    @DeleteMapping("professionalTitle")
    public ServerResponse removeProfessionalTitles(@RequestParam(value = "ids") String ids) {
        return professionalTitleService.deleteProfessionalTitlesByIds(ids);
    }

    /**
     * 更新职称
     *
     * @param professionalTitleId    professionalTitleId
     * @param professionalTitleName  professionalTitleName
     * @param professionalTitleLevel professionalTitleLevel
     * @return 更新的结果
     */
    @PutMapping("professionalTitle")
    public ServerResponse updateProfessionalTitle(@RequestParam(value = "updateId") String professionalTitleId,
                                                  @RequestParam(value = "updateName") String professionalTitleName,
                                                  @RequestParam(value = "professionalTitleLevel") String professionalTitleLevel) {

        return professionalTitleService.updateProfessionalTitleById(Long.valueOf(professionalTitleId),
                professionalTitleName, professionalTitleLevel);
    }

    /**
     * 查询所有角色
     *
     * @return roles
     */
    @GetMapping("role")
    public ServerResponse listRoles() {
        return roleService.listRoles();
    }

    /**
     * 增加角色
     *
     * @return roles
     */
    @PostMapping("role")
    public ServerResponse addRole(@RequestParam(value = "roleName") String roleName,
                                  @RequestParam(value = "chineseName") String chineseName) {
        return roleService.addRole(roleName, chineseName);
    }

    /**
     * 删除角色
     *
     * @return roles
     */
    @DeleteMapping("role")
    public ServerResponse deleteRole(@RequestParam(value = "roleId") String roleId) {
        return roleService.removeRole(Long.valueOf(roleId));
    }

    /**
     * 查询资源树
     *
     * @param roleId roleId
     * @return 资源树
     */
    @GetMapping("resourceTree")
    public ServerResponse getResourceTree(@RequestParam("roleId") String roleId,
                                          @RequestParam(value = "parentId", defaultValue = "0") String parentId) {
        Map<String, Object> map = new HashMap<>(2);
        List<ResourceVO> resourcesTree = resourceService.listResourcesTree(Long.valueOf(parentId));
        List<Long> resourceIdList = resourceService.listResourceIdsByRoleId(Long.valueOf(roleId));
        map.put("resourcesTree", resourcesTree);
        map.put("resourceIdList", resourceIdList);
        return ServerResponse.ok(map);
    }

    /**
     * 更新角色域资源的关联关系
     *
     * @param roleId         roleId
     * @param resourceIdList resourceIdList
     * @return 更新的结果
     */
    @PutMapping("/resourceRole")
    public ServerResponse updateRoleResource(Long roleId, Long[] resourceIdList) {
        return resourceRoleRelationService.updateResourceRole(roleId, resourceIdList);
    }

}
