package com.smart.spring.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Author: Ram
 * @Since: 2020.10.28 14:05
 */
@Data
public class User {
    private String name;
    private String password;
    private Address address;
    private List<Integer> list;
    private Map<String,String> map;

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
