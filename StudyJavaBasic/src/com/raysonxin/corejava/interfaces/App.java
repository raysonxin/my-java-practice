package com.raysonxin.corejava.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        Employee[] staff = new Employee[3];
//        staff[0] = new Employee("Alice", 5000, 2018, 1, 1);
//        staff[1] = new Employee("Bob", 3500, 2018, 1, 1);
//        staff[2] = new Employee("Cathy", 4900, 2018, 1, 1);
//
//        Arrays.sort(staff);
//
//        for (Employee e : staff) {
//            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
//        }

//        Test test = new Test();
//        System.out.println(test.getName());

//        String[] friends = {"Petdfder", "Psaul", "Alicessdfdfd"};
//
//        Arrays.sort(friends, String::compareToIgnoreCase);
//        for (String s : friends) {
//            System.out.println(s);
//        }

//        repeat(10, i -> System.out.println("Countdown:" + (9 - i)));
//
//        ArrayList list=new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.removeIf(e->(int)e==2);


        repeatAction(5, () -> System.out.println("Hello World!"));
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    public static void repeatAction(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }
}
