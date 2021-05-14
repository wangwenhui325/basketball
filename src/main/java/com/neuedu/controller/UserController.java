package com.neuedu.controller;

import com.neuedu.common.ServerResponse;
import com.neuedu.entity.User;
import com.neuedu.service.UserService;
import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //登录
    @RequestMapping(value = "/login")
    public ServerResponse login(String userName, String password, HttpSession session) {

        User user = userService.login(userName, password);
        /*if (!userService.existUsername(user.getUserName())) {
            return ServerResponse.success("该手机号尚未注册").data("isreg",(Object)"0");}
*/
        if (user != null) {
                session.setAttribute("user", user);
                return ServerResponse.success("”登录成功").data("user", user);
        } else {

            return ServerResponse.error("用户名或密码错误");
        }

    }

    //注册
    @RequestMapping(value = "/reg")
    public ServerResponse reg(User user, HttpSession session) {
        //服务器端数据校验
        if (StringUtils.isEmpty(user.getUserName())) {
            return ServerResponse.error("用户名不能为空");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            return ServerResponse.error("密码不能为空");
        }
        if (StringUtils.isEmpty(user.getNickName())) {
            return ServerResponse.error("昵称不能为空");
        }
        if (userService.existUsername(user.getUserName())) {
            return ServerResponse.error("用户名已存在");
        }
        //设置默认用户头像
        if (userService.existUsername(user.getUserName())) {
            user.setUserPhoto("default.jpg");
        }
        //填充注册时间
        user.setRegTime(new Date());

        //判断注册是否成功
        if (userService.reg(user)) {
            return ServerResponse.success("注册成功").data("user", user);
        } else {
            return ServerResponse.error("注册失败");
        }
    }


    //注销（退出登录）
    @RequestMapping(value = "/logout")
    public ServerResponse reg(HttpSession session) {
        session.removeAttribute("user");
        return ServerResponse.success("注销成功");
    }
}