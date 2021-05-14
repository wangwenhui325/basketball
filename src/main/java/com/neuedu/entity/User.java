package com.neuedu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer userId;

    private String userName;

    private String password;

    private String userPhoto;

    private String nickName;

    private Date regTime;


}