package com.lizhuxiong.lizxspringbootmybatis.dataSource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 *
 * 两个注意
 * 1.DataSourceBuilder.create().build()与DruidDataSourceBuilder.create().build()分别是默认的hikari与阿里的druid配置
 * 2.hikari配置文件数据库的url要改成jdbcUrl，druid的配置文件url就是url
 *
 *
 */

/**
 * @author com.mhout.lizx
 * @version 1.0.0
 * @ClassName:
 * @Description:
 * @date 2019/9/30
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource1")
    @ConfigurationProperties(prefix = "spring.datasource.db1") // application.properteis中对应属性的前缀
    public DataSource dataSource1() {
//        return DataSourceBuilder.create().build(); // 默认的hikari数据源
        return DruidDataSourceBuilder.create().build();
    }
}
