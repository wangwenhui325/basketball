package com.neuedu.controller;

import com.neuedu.entity.User;
import com.neuedu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//相当于@Controller+@ResponseBody

/*@Controller将类注册到IOC容器
@ResponseBody将返回值转换成JASON字符串*/
public class TestController {

@Autowired
private UserMapper userMapper;


    @RequestMapping("/hello")
    public User hello(){
        User user = userMapper.selectByPrimaryKey(1);
        return user;
    }
}
