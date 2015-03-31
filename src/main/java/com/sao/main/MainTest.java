package com.sao.main;

import com.sao.test.PeopleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by navia on 2015/3/31.
 */
public class MainTest {
    public static void main(String[] args){
        //Resource resource1 = new FileSystemResource("beans.xml");
        //Resource resource2 = new ClassPathResource("beans.xml");

        // 初始化Spring容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[] {"classpath:spring-context.xml"});

        //PeopleBean p = (PeopleBean)context.getBean("peopleBean");
        //System.out.println(p.sayHello());

    }
}
