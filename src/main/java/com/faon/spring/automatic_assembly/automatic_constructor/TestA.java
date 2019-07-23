package com.faon.spring.automatic_assembly.automatic_constructor;

public class TestA {
    private  String name;
    private TestB testB;

    public  TestA(TestB testB,String  name){
        this.testB=testB;
        this.name=name;
    }

    public String getName() {
        System.out.println("get name");
        return name;
    }


    public TestB getTestB() {
        System.out.println("get testB");
        return testB;
    }


    public  void  test(){
        testB.test();
    }
}
