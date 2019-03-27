package com.raysonxin.corejava.oop;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author raysonxin
 * @version 1.0 2019-03-27
 */
public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.setSalary(salary);
        this.setHireDay(LocalDate.of(year, month, day));
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%2.f", salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    /**
     * raise employee's salary by percent
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;

        if (otherObject == null)
            return false;

        if (getClass() != otherObject.getClass())
            return false;

        Employee other = (Employee) otherObject;

        return Objects.equals(getName(), other.getName())
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "[name=" + getName()
                + ",salary=" + salary
                + ",hireDay=" + hireDay
                + "]";
    }
}
