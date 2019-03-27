package com.raysonxin.corejava.oop;

public class Student extends Person {

    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student marjoring in " + major;
    }
}
