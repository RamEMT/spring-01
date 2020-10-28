package com.smart.spring.config;

import com.smart.spring.bean.Address;
import com.smart.spring.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Ram
 * @Since: 2020.10.28 17:01
 *
 *  Configuration : ssm 项目 xml + 注解的形式
 *  Springboot ：java  config + 注解的形式
 */
@Configuration
public class DruidConfig {

    @Bean
    public User getUser(Address addr){
        User user = new User();
        user.setName("test");
        //方式一
        //user.setAddress(address());
        //方式二（推荐使用）
        user.setAddress(addr);
        return user;
    }

    @Bean
    public Address addr(){
        return new Address();
    }
}
