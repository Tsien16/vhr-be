package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Department {
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
    * 是否生效，0-未生效，1-生效
    */
    private Boolean isEnabled;

    /**
    * 是否逻辑删除，1-表示删除，0-表示未删除 
    */
    private Boolean isDeleted;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
}