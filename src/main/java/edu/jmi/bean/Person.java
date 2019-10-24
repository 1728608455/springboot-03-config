package edu.jmi.bean;/*
 *@BelongsProject：springboot-03-config
 *@BelongPackage:edu.jmi.bean
 *@Author:admin
 *@CreateTime:2019/10/24/星期四/11:48
 *@Description:todo
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件的值映射到Person类里
 */
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
@PropertySource(value = {"classpath:person.properties"})//加载指定的配置文件
public class Person {
   // @Email
   // @Value("${person.last-name}")//获取peroperties里的属性值
    private  String lastName;
    //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private  boolean boss;
    private Date birth;
    private Map<String,Object> map;
    private List<Object> lists;
    private  Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }



}
