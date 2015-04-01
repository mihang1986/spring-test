package com.sao.aspect.pointcut3.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;

/**
 * Created by navia on 2015/4/1.
 */
@Component
public class Person3 {
    private String name;
    private Integer age;
    private Integer gender;

    public Person3() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
