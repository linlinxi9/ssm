package com.sangeng.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SGAspect {

    //定义切点
    @Pointcut("execution(* com.sangeng.service..*.*(..))")
    public void pt(){

    }

    //进行增强
    @Before("pt()")
    public void before(){
        System.out.println("before");
    }
}
