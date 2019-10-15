package com.tsien.vhr.vo;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

@Data
public class DepartmentVO {
    /**
     * 部门ID
     */
    private Long departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门级别
     */
    private String departmentLevel;

    /**
     * 上级部门ID
     */
    private Long parentId;

    /**
     * 下级部门
     */
    private List<DepartmentVO> children;
}