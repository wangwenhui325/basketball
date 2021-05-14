package com.neuedu.mapper;

import com.neuedu.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //登录
    User findUser(@Param(value = "userName") String userName, @Param(value = "password") String password);

    //查找用户是否存在
    int isUserExist(String userName);
}