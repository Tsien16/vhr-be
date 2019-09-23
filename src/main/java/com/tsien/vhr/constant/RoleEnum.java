package com.tsien.vhr.constant;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 16:18
 */

public enum RoleEnum {

    /**
     * 需要登录
     */
    ROLE_LOGIN("ROLE_LOGIN");

    private String roleName;

    RoleEnum(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

}
