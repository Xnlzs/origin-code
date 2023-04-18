package com.xnl.origincode.service.user;

import java.io.Serializable;

/**
 * @description: 用户实体
 * @author: xiaonailiang
 * @create: 2023/04/17 10:34
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4345528274182860290L;

    private String name;

    private Integer age;

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
}
