package com.sao.aspect.pointcut1;

import com.sao.aspect.pointcut1.bean.Person1;
import com.sao.aspect.pointcut2.bean.Person2;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by navia on 2015/3/31.
 */
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class MainTest extends AbstractJUnit4SpringContextTests {
    @Resource
    private Person1 person1;

    @Resource
    private Person2 person2;

    @Test
    public void test1(){
        person1.sayHello();
        person2.sayHello();
    }
}
