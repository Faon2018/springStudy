package com.faon.spring.spring_di.functionDI;

public class TestA {
    private  TestB testB;

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
