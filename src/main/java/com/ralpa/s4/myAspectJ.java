package com.ralpa.s4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: ralap
 * @date: created at 2019/7/28 19:54
 */
@Component
@Aspect
public class myAspectJ {

    @Pointcut(value = "@annotation(com.ralpa.s4.LogPoint)")
    public void pointCut() {

    }

    @Around("pointCut()")
    public Object log(ProceedingJoinPoint point) {

        System.out.println("start............");
        try {
            Object proceed = point.proceed();
            System.out.println("end.............");
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return null;
    }
}
