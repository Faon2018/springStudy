package com.faon.spring.spring_ioc.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        BeanFactory bf= new XmlBeanFactory(new ClassPathResource("bean.xml"));
        HelloWorld helloWorld  = (HelloWorld) bf.getBean("beanFactory");
        helloWorld.getMessage();
    }
}
