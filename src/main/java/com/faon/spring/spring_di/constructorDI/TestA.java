package com.faon.spring.spring_di.constructorDI;

public class TestA {
    private TestB testB;

    public  TestA(){
        super();
        System.out.println("constructor TestA of emporty");
    }
    public  TestA(TestB testB){
        System.out.println("constructor TestA");
        this.testB=testB;
    }

    public void  test(){
        testB.test();
    }

    public  void  testC(){
        System.out.println("testA testC()");
    }
}
