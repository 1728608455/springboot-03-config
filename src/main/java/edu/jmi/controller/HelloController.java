package edu.jmi.controller;/*
 *@BelongsProject：springboot-03-config
 *@BelongPackage:edu.jmi.controller
 *@Author:admin
 *@CreateTime:2019/10/24/星期四/17:20
 *@Description:todo
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${person.last-name}")
    private String name;
    @RequestMapping("sayHello")
    public String  sayHello(){
        return "hello"+name;
    }
}
