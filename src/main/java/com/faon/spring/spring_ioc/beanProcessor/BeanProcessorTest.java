package com.faon.spring.spring_ioc.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessorTest implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before of init");
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after of  init");
        return bean;
    }
}
