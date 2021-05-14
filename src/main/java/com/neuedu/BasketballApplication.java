package com.neuedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//标注了@SpringBootApplication注解的类是SpringBoot的启动类
@SpringBootApplication
@MapperScan(basePackages = "com.neuedu.mapper")
public class BasketballApplication {

    public static void main(String[] args) {
        //运行SpringBoot启动类(启动项目)
        SpringApplication.run(BasketballApplication.class, args);
    }
}
