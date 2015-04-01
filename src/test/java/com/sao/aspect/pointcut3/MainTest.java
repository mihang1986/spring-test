package com.sao.aspect.pointcut3;

import com.sao.aspect.pointcut2.bean.Person2;
import com.sao.aspect.pointcut3.bean.Person3;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.beans.ConstructorProperties;

/**
 * Created by navia on 2015/3/31.
 */
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class MainTest extends AbstractJUnit4SpringContextTests {
    @Resource
    private Person3 person3;

    @Test
    public void test1(){
        System.out.println("====================================== pointcut3 ======================================");
        person3.setName("好人");
        person3.setAge(13);
        person3.setGender(1);


        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person3.getGender());
    }
}
