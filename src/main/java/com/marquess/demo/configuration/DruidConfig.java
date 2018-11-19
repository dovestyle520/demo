package com.marquess.demo.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.ConstructorProperties;

@Configuration
public class DruidConfig {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource durid() {
        return new DruidDataSource();
    }
}
