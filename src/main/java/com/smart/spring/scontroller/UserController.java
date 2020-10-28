package com.smart.spring.scontroller;

import com.smart.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: Ram
 * @Since: 2020.10.28 11:31
 */
@Controller
public class UserController {

    /*@Autowired*/
    @Resource
    public UserService userService;

}
