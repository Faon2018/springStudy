package com.faon.spring.spring_di.functionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanFunctionDI.xml");
        TestA testA= (TestA) ac.getBean("testA");
        testA.test();
    }
}
