package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //scope = prototype
        // objects aren't created if we don't ask for those object

        //If bean scope is prototype then objects will be created only if we ask for those objects
        //if scope is singleton then object will be created right at context startup
        ApplicationContext context = new ClassPathXmlApplicationContext("projectBean.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student);

        //when the spring context is closed then only the objects created by spring will be destoryed
        ((ClassPathXmlApplicationContext)context).close();
    }
}
