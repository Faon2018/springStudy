package com.faon.spring.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestA {
    @Autowired
    @Qualifier(value = "testC")//
    private TestB testB;
    public  void test(){
        System.out.println("TestA test()");
        testB.test();
    }
}
