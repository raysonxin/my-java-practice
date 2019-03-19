package com.raysonxin.consumer;

import com.raysonxin.contracts.SayHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-consumer.xml");
        SayHello sayHello = (SayHello) ctx.getBean("sayHello");
        String s = sayHello.sayHello("raysonxin");
        System.out.println(s);
    }
}
