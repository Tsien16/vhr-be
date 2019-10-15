package com.tsien.vhr.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

@Data
public class Department {
    /**
     * 部门ID
     */
    private Long departmentId;

    /**
     * 部门名称
     */
    @NotBlank(message = "部门名称不能为空")
    private String departmentName;

    /**
     * 部门级别
     */
    private Integer departmentLevel;

    /**
     * 上级部门ID
     */
    @NotNull(message = "上级部门ID不能为空")
    private Long parentId;

    /**
     * 是否生效，0-未生效，1-生效
     */
    private Boolean enabled;

    /**
     * 是否逻辑删除，1-表示删除，0-表示未删除
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 下级部门
     */
    private List<Department> children;
}