package com.faon.spring.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 与注解@required 相同，但不能检测注解属性是否为空，但是@required却可以
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotationAutowired.xml");
        TestA testA= (TestA) ac.getBean("testA");
        testA.test();
    }
}
