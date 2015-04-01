package com.sao.aspect.pointcut3;

import com.sao.aspect.pointcut3.bean.Person3;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by navia on 2015/4/1.
 */
@Aspect
public class Pointcut3 {

    /**
     * 环绕拦截器可以改变一个原本函数的返回值
     * @param jp
     * @return
     */
    @Around(value = "execution(java.lang.String com.sao.aspect.pointcut3.bean.Person3.getName())")
     public String aroundNameAdvice(ProceedingJoinPoint jp){
        return "haha";
    }

    /**
     * 这里拦截方法,可以改变BEAN中的内容
     * @param jp
     * @return
     * @throws Throwable
     */
    @Around(value = "execution(java.lang.Integer com.sao.aspect.pointcut3.bean.Person3.getAge())")
    public Integer aroundAgeAdvice(ProceedingJoinPoint jp) throws Throwable {
        Person3 p = (Person3)jp.getTarget();
        p.setAge(p.getAge() + 100);

        return (Integer)jp.proceed();
    }

    /**
     * 这里不改变BEAN中的内容,只是先取得值,在进行返回
     * @param jp
     * @return
     * @throws Throwable
     */
    @Around(value = "execution(java.lang.Integer com.sao.aspect.pointcut3.bean.Person3.getGender())")
    public Integer aroundGenderAdvice(ProceedingJoinPoint jp) throws Throwable {
        System.out.println(String.format("calling - %s.%s", jp.getSignature().getDeclaringTypeName(), jp.getSignature().getName()));

        Integer result = (Integer)jp.proceed();

        return result + 1;
    }
}
