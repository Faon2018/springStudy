package com.faon.spring.spring_di.functionDI;

public class TestA {
    private  TestB testB;
    private  String name;
    public TestA(){
        super();
        System.out.println("constructor TestA");
    }
    public void setTestB(TestB testB) {
        System.out.println("set testB");
        this.testB = testB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public   void test(){
        System.out.println(name);
        testB.test();
    }
}
