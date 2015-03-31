package com.sao.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by navia on 2015/2/10.
 */
/**
 *annotaion配置注解中用@Component来表示一个通用注释用于说明一个类是一个spring容器管理的类。
 *即就是该类已经拉入到spring的管理中了。
 *而@Controller, @Service, @Repository是@Component的细化，
 *这三个注解比@Component带有更多的语义，它们分别对应了控制层、服务层、持久层的类。
 */
//@Component(value = "aaa")
@Component
@Scope("prototype")
public class PeopleBean {
    /**
     * @PostConstruct 在对象构造后立刻被执行
     */
    @PostConstruct
    public void postConstruct1(){
        System.out.println("postConstruct1");
    }

    /**
     * @PreDestroy 在对象销毁之前被执行
     */
    @PreDestroy
    public void preDestroy1(){
        System.out.println("preDestroy1");
    }

    public String sayHello(){
        return "hello";
    }
}
