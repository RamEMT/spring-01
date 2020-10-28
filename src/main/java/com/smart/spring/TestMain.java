package com.smart.spring;

import com.smart.spring.bean.Product;
import com.smart.spring.bean.User;
import com.smart.spring.controller.UserController;
import com.smart.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Ram
 * @Since: 2020.10.28 14:08
 */
public class TestMain {
    public static void main(String[] args) {
        //注解注册
        String path = "classpath:spring-context.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        //需要强转
        //Object user1 = applicationContext.getBean("user");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.toString());
        User user1 = applicationContext.getBean("user", User.class);
        System.out.println(user1);

        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);

        UserController userController = applicationContext.getBean("userController", UserController.class);

        System.out.println(userController);
        userController.testOne();

        System.out.println("--------");

        UserService userService = userController.userService;
        userService.test();
    }
}
