package com.raysonxin.corejava.interfaces;

public interface Person {
    default String getName() {
        return getClass().getName() + "_" + hashCode();
    }
}
