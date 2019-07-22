package com.faon.spring.spring_ioc.applicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWorld= (HelloWorld) ac.getBean("applicationContext");
        helloWorld.getMessage();

    }
}
