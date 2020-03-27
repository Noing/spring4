package com.ralpa.s4.spi;

import java.util.ServiceLoader;

/**
 * @author: ralap
 * @date: created at 2019/7/29 17:42
 */
public class SpiDemo {

    public static void main(String[] args) {

        ServiceLoader<SpiInterface> serviceLoader = ServiceLoader.load(SpiInterface.class);
        System.out.println("SPI.......");
        serviceLoader.forEach(spi->{
            spi.
        });
        serviceLoader.forEach(SpiInterface::sayHi);


    }
}
