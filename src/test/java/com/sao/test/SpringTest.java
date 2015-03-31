package com.sao.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by navia on 2015/2/10.
 *
 * 测试类必须继承AbstractJUnit4SpringContextTests或者
 *  AbstractTransactionalJUnit4SpringContextTests
 * 如果测试需要用到事务,那么就用AbstractTransactionalJUnit4SpringContextTests
 * 否则用AbstractJUnit4SpringContextTests
 */
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class SpringTest extends AbstractJUnit4SpringContextTests {

    //@Resource(name = "aaa")
    @Autowired
    private PeopleBean peopleBean;

    @Test
    public void Test() {
        peopleBean.sayHello();
    }
}