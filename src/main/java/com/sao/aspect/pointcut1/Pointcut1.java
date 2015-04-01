package com.sao.aspect.pointcut1;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

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

    /**
     * 定义前置通知 使用切入点 pointcut1
     * @param jp
     */
    @Before(value = "pointcut1()")
    private void beforeAdvice(JoinPoint jp){
        System.out.println("beforeAdvice has worked");
    }

    /**
     * 定义后置返回通知
     * @param jp
     */
    @AfterReturning(value = "pointcut1()")
    private void afterReturnAdvice(JoinPoint jp){
        System.out.println("afterReturnAdvice has worked");
    }

    /**
     * 定义后置最终通知 使用切入点 pointcut1
     * @param jp
     */
    @After(value = "pointcut1()")
    private void afterAdvice(JoinPoint jp){
        System.out.println("afterAdvice has worked");
    }

    /**
     * 定义后置异常通知
     * @param jp
     */
    @AfterThrowing(value = "pointcut1()")
    private void afterThrowingAdvice(JoinPoint jp){
        System.out.println("afterThrowingAdvice has worked");
    }


    /**
     * 定义环绕拦截器
     * 这个拦截器有些特殊,其参数是ProceedingJoinPoint
     * 用户必须手动调用pjp.proceed();方法,才能使原方法执行
     * @param pjp
     * @throws Throwable
     */
    @Around(value = "pointcut1()")
    private void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundAdvice has worked");
        pjp.proceed();
        System.out.println("aroundAdvice has worked");
    }
}
