package com.yonghui.platform.usercenter.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.yonghui.platform")
@SpringBootApplication
public class UsercenterControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercenterControllerApplication.class, args);
    }

}
