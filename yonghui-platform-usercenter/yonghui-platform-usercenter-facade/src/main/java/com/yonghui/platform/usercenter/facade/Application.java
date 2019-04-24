package com.yonghui.platform.usercenter.facade;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "com.yonghui.platform.usercenter.service",
        "com.yonghui.platform.usercenter.facade.impl"}
)
@MapperScan("com.yonghui.platform.usercenter.dao")
@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
