package com.neuedu.service.impl;

import com.neuedu.entity.User;
import com.neuedu.mapper.UserMapper;
import com.neuedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName, String password) {
        return userMapper.findUser(userName,password);
    }

    @Override
    public Boolean reg(User user) {
        return userMapper.insert(user)>0;
    }

    @Override
    public Boolean existUsername(String userName) {
        return userMapper.isUserExist(userName) > 0;
    }
}
