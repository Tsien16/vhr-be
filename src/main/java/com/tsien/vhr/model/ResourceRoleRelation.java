package com.tsien.vhr.model;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

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