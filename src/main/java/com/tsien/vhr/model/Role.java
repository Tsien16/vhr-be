package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Role {
    /**
    * 角色ID
    */
    private Long roleId;

    /**
    * 角色名称
    */
    private String roleName;

    /**
    * 角色中文名称
    */
    private String chineseName;

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