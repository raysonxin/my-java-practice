package com.raysonxin.concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

//        ApplicationContext ctx=new AnnotationConfigApplicationContext(ConcertConfig.class);
//        Performance p=ctx.getBean(Performance.class);
//        p.perform();

        ClassPathXmlApplicationContext xmlCtx=new ClassPathXmlApplicationContext("spring.xml");
        Performance p= xmlCtx.getBean(Performance.class);
        p.perform();

        Encoreable coreable=(Encoreable)p;
        coreable.performEncore();
    }

}
