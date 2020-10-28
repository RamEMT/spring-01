package com.smart.spring.service.impl;

import com.smart.spring.dao.UserDao;
import com.smart.spring.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Ram
 * @Since: 2020.10.28 17:34
 *
 *  如果有一个接口有多个实现类
 *  可以使用 @Primary 让spring容器优先查找该依赖
 */
@Service
@Primary
public class UserService2Impl implements UserService {

    @Resource
    public UserDao userDao;

    @Override
    public void test() {
        userDao.sayHello();
        System.out.println("今晚吃大白馒头");
    }
}
