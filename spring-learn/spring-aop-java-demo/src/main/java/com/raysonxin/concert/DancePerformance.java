package com.raysonxin.concert;

import org.springframework.stereotype.Service;

public class DancePerformance implements Performance {
    public void perform() {
        System.out.println("dancing....");
    }
}
