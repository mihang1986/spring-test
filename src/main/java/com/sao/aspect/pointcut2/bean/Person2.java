package com.sao.aspect.pointcut2.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by navia on 2015/4/1.
 */
@Component
@Scope("prototype")
public class Person2 {
    public void say(String msg1, String msg2){
        System.out.println(msg1 + ", " + msg2);
    }
}
