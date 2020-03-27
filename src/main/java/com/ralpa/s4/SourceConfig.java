package com.ralpa.s4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: ralap
 * @date: created at 2019/7/8 23:04
 */
@Configuration
@ComponentScan("com.ralpa.s4")
@EnableAspectJAutoProxy
public class SourceConfig {

    @Bean(initMethod = "init")
    public Teacher teacher() {
        return new Teacher();
    }

}
