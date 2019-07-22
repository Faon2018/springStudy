package com.faon.spring.spring_ioc.beanLifeCycle;

public class HelloWorld {
    private String  message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public  void init(){
        System.out.println("beanLifeCycle init()");
    }

    public  void destroy(){
        System.out.println("beanLifeCycle destroy()");
    }
}
