package com.ralpa.s4;

import org.springframework.stereotype.Component;

/**
 * @author: ralap
 * @date: created at 2019/7/28 20:07
 */
@Component
public class Computer {


    @LogPoint
    public int add(int a, int b) {
        System.out.println("add");
        return a + b;
    }

}
