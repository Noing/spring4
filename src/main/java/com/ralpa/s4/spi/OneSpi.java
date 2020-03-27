package com.ralpa.s4.spi;

/**
 * @author: ralap
 * @date: created at 2019/7/29 17:39
 */
public class OneSpi implements SpiInterface {

    @Override
    public void sayHi() {
        System.out.println("Hi one......");
    }
}
