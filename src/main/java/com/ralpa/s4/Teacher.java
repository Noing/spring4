package com.ralpa.s4;

import java.util.concurrent.Executors;

/**
 * @author: ralap
 * @date: created at 2019/7/8 23:09
 */
public class Teacher {

    private String tName;
    private String tAge;

    public Teacher() {

        System.out.println("Teacher Constractor..............");
    }

    public void init() {
        Executors.newFixedThreadPool(10);
        System.out.println("123");
    }
}
