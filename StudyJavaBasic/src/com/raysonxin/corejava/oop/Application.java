package com.raysonxin.corejava.oop;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws Exception {

        ArrayList<Employee> staffList = new ArrayList<>();

        Manager boss = new Manager("Tom", 1000, 2018, 10, 2);
        boss.setBonus(1000);

        staffList.add(boss);

        staffList.add(new Employee("Bob", 500, 2018, 1, 2));
        staffList.add(new Employee("Alice", 300, 2018, 1, 1));

        staffList.add(2, boss);


        for (Employee e : staffList)
            System.out.println(e.getName() + "'s salary is " + e.getSalary());

        String val = Size.SMALL.toString();

        Size size = Enum.valueOf(Size.class, "SMALL");


        System.out.println("the largest value is: " + maxValue(1, 2, 3, 4, 5));

        TestObject obj = new TestObject();

        String typeName = obj.getClass().getName();
        //Class.forName(typeName).newInstance();

        TestObject o2 = (TestObject) Class.forName(typeName).newInstance();
    }


    public static double maxValue(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (v > largest) {
                largest = v;
            }
        }
        return largest;
    }


    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE
    }
}
