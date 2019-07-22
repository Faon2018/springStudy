package com.faon.spring.spring_di.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beanDI.xml");
        TestA testA= (TestA) ac.getBean("testA");
//        testA.test();
        testA.testC();
    }
}
