package com.sao.aspect.pointcut1;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by navia on 2015/3/31.
 */
@Aspect
public class Pointcut1 {

    /**
     * 定义一个切入点,切入点名称就是函数名称
     * 这里是pointcut1, 该切入点拦截
     * com.sao.aspect.pointcut1.bean包下所有类的所有方法
     */
    @Pointcut(value = "execution(* com.sao.aspect.pointcut1.bean.*.*(..))")
    private void pointcut1(){}

    @Before(value = "pointcut1()")
    private void beforeAdvice(JoinPoint jp){
        System.out.println("pointcut1 has worked");
    }
}
