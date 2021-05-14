package com.neuedu.service;

import com.neuedu.entity.User;

public interface UserService {
    //登录
    User login(String userName, String password);
    //注册
    Boolean reg(User user);

    //是否存在用户名
    Boolean existUsername(String userName);


}
