package com.tsien.vhr.model;

import lombok.Data;

@Data
public class UserRoleRelation {
    /**
    * 用户与角色关联关系表主键
    */
    private Long id;

    /**
    * 用户ID
    */
    private Long userId;

    /**
    * 角色ID
    */
    private Long roleId;
}