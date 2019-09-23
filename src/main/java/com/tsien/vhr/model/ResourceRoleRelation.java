package com.tsien.vhr.model;

import lombok.Data;

@Data
public class ResourceRoleRelation {
    /**
    * 资源与角色关联表主键
    */
    private Long id;

    /**
    * 资源ID
    */
    private Long resourceId;

    /**
    * 角色ID
    */
    private Long roleId;
}