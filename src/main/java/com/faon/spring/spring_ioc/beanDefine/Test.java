package com.faon.spring.spring_ioc.beanDefine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext  ac =new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWoeld= (HelloWorld) ac.getBean("beanDefine");
        helloWoeld.setMessage("the prototype test");
        helloWoeld.getMessage();

        HelloWorld helloWoeld1= (HelloWorld) ac.getBean("beanDefine");
        helloWoeld1.getMessage();
    }
}
