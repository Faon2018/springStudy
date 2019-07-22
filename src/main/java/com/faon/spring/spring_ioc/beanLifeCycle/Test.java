package com.faon.spring.spring_ioc.beanLifeCycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {//AbstractApplicationContext 中有registerShutdownHook()方法，便于测试（相当于手动销毁bean）
    public static void main(String[] args) {
        AbstractApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWorld= (HelloWorld) ac.getBean("beanLifeCycle");
        helloWorld.getMessage();
        ac.registerShutdownHook();
    }
}
