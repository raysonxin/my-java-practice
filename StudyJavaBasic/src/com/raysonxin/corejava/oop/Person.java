package com.raysonxin.corejava.oop;

public abstract class Person {

    public Person(String name) {
        this.name = name;
    }

    private String name;

    public abstract String getDescription();

    public String getName() {
        return this.name;
    }
}
