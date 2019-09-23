package com.tsien.vhr.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/9 0009 12:35
 */

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
    private Boolean deleted;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
}