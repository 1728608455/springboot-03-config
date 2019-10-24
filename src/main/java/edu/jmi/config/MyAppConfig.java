package edu.jmi.config;/*
 *@BelongsProject：springboot-03-config
 *@BelongPackage:edu.jmi.config
 *@Author:admin
 *@CreateTime:2019/10/24/星期四/18:02
 *@Description:todo
 */

import edu.jmi.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//配置类，指明当前类是一个配置类，代替以前的spring的配置类
@Configuration
public class MyAppConfig {
    @Bean//将方法的返回值添加到ioc容器里，容器中的组件默认的id就是方法名
    public HelloService helloService(){
        System.out.println("给配置类中添加组件了");
        return new HelloService();
    }
}
