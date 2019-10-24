package edu.jmi.bean;/*
 *@BelongsProject：springboot-03-config
 *@BelongPackage:edu.jmi.bean
 *@Author:admin
 *@CreateTime:2019/10/24/星期四/11:50
 *@Description:todo
 */

public class Dog {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
