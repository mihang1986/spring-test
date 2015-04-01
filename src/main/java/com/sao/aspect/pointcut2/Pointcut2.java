package com.sao.aspect.pointcut2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by navia on 2015/4/1.
 */
@Aspect
public class Pointcut2 {

    /**
     * 直接定义前置通知
     * 拦截com.sao.aspect.pointcut2.bean包下所有类的所有方法
     * @param jp
     */
    @Before(value = "execution(* com.sao.aspect.pointcut2.bean.*.*(..))")
    private void beforeAdvice(JoinPoint jp){
        System.out.println("beforeAdvice has worked");
    }

    /**
     * 直接定义切入点
     * @param jp
     * @param msg1
     * @param msg2
     */
    @Before(value = "execution(* com.sao.aspect.pointcut2.bean.*.*(..)) and args(msg1, msg2)")
    private void beforeAdvice(JoinPoint jp, String msg1, String msg2){
        System.out.println(String.format("this method param is : [%s, %s]", msg1, msg2));
    }
}
