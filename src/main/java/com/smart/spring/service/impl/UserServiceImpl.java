package com.smart.spring.service.impl;

import com.smart.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: Ram
 * @Since: 2020.10.28 11:26
 *
 *  service层使用 @Service 注册
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void test() {
        System.out.println("service测试的方法1");
    }
}
