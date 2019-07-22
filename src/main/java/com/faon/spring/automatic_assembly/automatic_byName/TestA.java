package com.faon.spring.automatic_assembly.automatic_byName;

public class TestA {
    private  String name;
    private TestB testB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }

    public  void  test(){
        testB.test();
    }
}
