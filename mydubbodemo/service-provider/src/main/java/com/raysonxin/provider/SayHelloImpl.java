package com.raysonxin.provider;

import com.raysonxin.contracts.SayHello;

public class SayHelloImpl implements SayHello {
    public String sayHello(String name) {
        System.out.println("i'm here!");
        return "Hello "+name;
    }
}
