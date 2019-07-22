package com.faon.spring.spring_ioc.beanProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWorld= (HelloWorld) ac.getBean("beanProcessor");
        helloWorld.getMessage();
        ac.registerShutdownHook();
    }
}
