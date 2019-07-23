package com.faon.spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Autowired 可使用过在属性上，构造方法，setter方法上，xml配置一样同属性
 *
 */
public class TestA {
    @Autowired
    private TestB testB;
    public TestA(){
        super();
        System.out.println("constructor TestA");
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }

    public   void test(){
        testB.test();
    }
}
