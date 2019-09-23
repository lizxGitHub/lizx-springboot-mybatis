package com.lizhuxiong.lizxspringbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lizhuxiong.lizxspringbootmybatis.dao")
public class LizxSpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LizxSpringbootMybatisApplication.class, args);
    }

}
