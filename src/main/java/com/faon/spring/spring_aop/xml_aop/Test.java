package com.faon.spring.spring_aop.xml_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("aopXml.xml");
        TestB testB= (TestB) applicationContext.getBean("testB");
        testB.getName();
        testB.getTest();
        testB.printThrowException();

    }
}
