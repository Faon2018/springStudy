package com.faon.spring.spring_di.innerDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("innerDI.xml");
        TestA testA= (TestA) ac.getBean("testA");
        testA.test();

    }
}
