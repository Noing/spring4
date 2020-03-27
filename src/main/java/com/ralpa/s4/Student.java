package com.ralpa.s4;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author: ralap
 * @date: created at 2019/7/8 23:09
 */
@Component
public class Student implements BeanNameAware{

    private String sName;
    private String sAge;

    public Student() {

        System.out.println("Student Constractor..............");
    }

    public void setBeanName(String name) {
        System.out.println(name);
    }
}
