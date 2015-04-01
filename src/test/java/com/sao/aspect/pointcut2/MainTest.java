package com.sao.aspect.pointcut2;

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
    private Person2 person2;

    @Test
    public void test1(){
        System.out.println("====================================== pointcut2 ======================================");
        person2.say("nihao2", "haha");
    }
}
