package com.faon.spring.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotationQualifier.xml");
        TestA testA= (TestA) applicationContext.getBean("testA");
        testA.test();
    }
}
