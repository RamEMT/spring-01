package com.smart.spring.controller;

import com.smart.spring.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: Ram
 * @Since: 2020.10.28 11:31
 *
 *  controller层使用 @Controller 注册
 */
@Controller
public class UserController {

    /**
     *
     *  Autowired : 注入方式有 构造方法、方法、属性上
     *      只会根据类型查找相关依赖对象，可以和 @Qualifier(只会根据名字查找依赖对象) 一起使用
     *  Resource : （推荐使用）
     *      如果选择默认，会先根据 name 属性查找依赖对象，找不到则会根据 type 属性查找依赖，找不到则直接报错
     */
    /*@Autowired*/

    @Resource

    public UserService userService;

    /*
    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    */

    public void testOne(){
        userService.test();
        System.out.println("o(*￣︶￣*)o");
    }
}
