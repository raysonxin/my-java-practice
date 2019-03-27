package com.raysonxin.corejava.oop;

public class Manager extends Employee {

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        //     this.setBonus(bonus);
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
            return false;

        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    @Override
    public String toString() {
        return super.toString()
                + "[bonus=" + bonus
                + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * Double.hashCode(bonus);
    }
}
