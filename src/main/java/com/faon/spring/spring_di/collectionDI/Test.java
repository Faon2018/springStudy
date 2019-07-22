package com.faon.spring.spring_di.collectionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext  ac= new ClassPathXmlApplicationContext("collectionDI.xml");
        HelloWorld helloWorld= (HelloWorld) ac.getBean("collectionDI");
        helloWorld.getList();
        helloWorld.getSet();
        helloWorld.getMap();
        helloWorld.getPropreties();

    }
}
