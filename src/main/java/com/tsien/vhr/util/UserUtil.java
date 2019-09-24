package com.tsien.vhr.util;

import com.tsien.vhr.model.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 18:24
 */

public class UserUtil {

    /**
     * 通过SecurityContextHolder获取到用户信息
     *
     * @return User
     */
    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
