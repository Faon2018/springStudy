package com.faon.spring.automatic_assembly.automatic_byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("auotomaticByName.xml");
       TestA testA= (TestA) ac.getBean("testA");
       testA.test();

    }
}
