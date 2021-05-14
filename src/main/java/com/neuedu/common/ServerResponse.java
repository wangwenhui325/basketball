package com.neuedu.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ServerResponse {
    private  Integer stats;   //1: 成功   0： 失败
    private String message;
    private Map<String, Object> data = new HashMap<>();

    //构造方法私有化
    private ServerResponse(){
    }

    //成功的返回
    public static ServerResponse success(String message){

        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setStats(Const.SUCCESS);
        serverResponse.setMessage(message);
        return serverResponse;
    }

    //成功的返回，添加数据
    public ServerResponse data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    //失败的返回
    public static ServerResponse error(String message){

        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setStats(Const.ERROR);
        serverResponse.setMessage(message);
        return serverResponse;
    }
}
