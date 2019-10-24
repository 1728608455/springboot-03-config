package edu.jmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})//importResource加载自定义的spring的配置文件
@SpringBootApplication
public class Springboot03ConfigApplication {

    public static void main(String[] args) {

        SpringApplication.run(Springboot03ConfigApplication.class, args);
    }

}
