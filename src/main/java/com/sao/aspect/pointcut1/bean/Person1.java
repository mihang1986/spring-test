package com.sao.aspect.pointcut1.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by navia on 2015/2/10.
 */
@Component
@Scope("prototype")
public class Person1 {
    public void say(String msg){
        if(null == msg || "".equals(msg)){
            throw new RuntimeException("没有传递消息");
        }else {
            System.out.println("person say : " + msg);
        }
    }
}
