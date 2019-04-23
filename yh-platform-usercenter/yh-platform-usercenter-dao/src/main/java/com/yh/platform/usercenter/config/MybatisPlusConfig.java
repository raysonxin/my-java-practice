package com.yh.platform.usercenter.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yh.platform.usercenter.mapper")
public class MybatisPlusConfig {
}
