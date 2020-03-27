package com.ralpa.s4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: ralap
 * @date: created at 2019/7/8 23:08
 */
public class SpringMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SourceConfig.class);
//        Teacher teacher = context.getBean(Teacher.class);
//        System.out.println(teacher);
        Computer bean = context.getBean(Computer.class);
        int add = bean.add(1, 2);
        System.out.println(add);

        context.close();
    }

}
