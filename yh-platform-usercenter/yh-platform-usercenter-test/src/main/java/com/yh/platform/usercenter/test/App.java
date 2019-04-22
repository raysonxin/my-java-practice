package com.yh.platform.usercenter.test;

import com.yh.platform.usercenter.facade.stub.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
