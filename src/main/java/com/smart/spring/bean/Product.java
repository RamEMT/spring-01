package com.smart.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author: Ram
 * @Since: 2020.10.28 15:13
 *
 *  注解注册
 *  Component ：
 *      往容器中注册对象，在类上使用 -- 三层以外用
 *      value：给容器中bean指定名字，如果不指定则类名首字母小写
 *
 *  Service ：
 *      声明在 service 层
 *
 *  Repository ：
 *      声明在 Dao 层
 *
 *  Controller ：
 *      声明在 controller 层
 */
@Component
@Data
public class Product {
    private String name;
    private BigDecimal price;
}
