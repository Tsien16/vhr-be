package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.UserDAO;
import com.tsien.vhr.model.User;
import com.tsien.vhr.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 14:57
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    /**
     * 根据用户名查询用户
     *
     * @param username username
     * @return UserDetails
     * @throws UsernameNotFoundException UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名错误");
        }
        return user;
    }
}
