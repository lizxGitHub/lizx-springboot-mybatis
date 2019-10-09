package com.lizhuxiong.lizxspringbootmybatis;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
/**
 * 配置自定义数据源，先要将spring boot自带的DataSourceAutoConfiguration禁掉
 * 实际测试 注册不注册效果一样
 */
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@Import({DataSourceConfig1.class})
//@MapperScan("com.lizhuxiong.lizxspringbootmybatis.dao")
public class LizxSpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LizxSpringbootMybatisApplication.class, args);
    }

}
