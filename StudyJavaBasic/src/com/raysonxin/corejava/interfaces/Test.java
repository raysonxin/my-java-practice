package com.raysonxin.corejava.interfaces;

public class Test implements Named, Person {

    public Test() {
    }


    public String getName(){
        return Person.super.getName();
    }
}
