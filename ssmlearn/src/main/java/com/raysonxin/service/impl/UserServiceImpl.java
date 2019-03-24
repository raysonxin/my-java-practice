package com.raysonxin.service.impl;

import com.raysonxin.dao.UserDao;
import com.raysonxin.entity.User;
import com.raysonxin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
