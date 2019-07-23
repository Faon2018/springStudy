package com.faon.spring.annotation.required;

import org.springframework.beans.factory.annotation.Required;

public class TestA {
    private TestB testB;
    private  String name;
    public TestA(){
        super();
        System.out.println("constructor TestA");
    }
    @Required
    public void setTestB(TestB testB) {
        System.out.println("set testB");
        this.testB = testB;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public   void test(){
        System.out.println(name);
        testB.test();
    }
}
