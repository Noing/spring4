package com.ralpa.s4.spi;

/**
 * @author: ralap
 * @date: created at 2019/7/29 17:39
 */
public class TwoSpi implements SpiInterface {

    @Override
    public void sayHi() {
        System.out.println("Hi two......");
    }
}
