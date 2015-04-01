package com.sao.aspect.pointcut1;

import com.sao.aspect.pointcut1.bean.Person1;
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


    @Test
    public void test1(){
        System.out.println("====================================== pointcut1 ======================================");
        person1.say("nihao1");
    }
}
