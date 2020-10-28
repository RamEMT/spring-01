package com.smart.spring;

import com.smart.spring.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Ram
 * @Since: 2020.10.28 14:08
 */
public class TestMain {
    public static void main(String[] args) {
        String path = "classpath:spring-context.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        /*
            需要强转
            Object user1 = applicationContext.getBean("user");
        */
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.toString());


    }
}
