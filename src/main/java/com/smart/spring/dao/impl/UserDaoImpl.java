package com.smart.spring.dao.impl;

import com.smart.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author: Ram
 * @Since: 2020.10.28 18:46
 *
 *  dao层使用 @Repository 注册
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void sayHello() {
        System.out.println("dao：hello!");
    }
}
