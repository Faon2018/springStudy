package com.faon.spring.spring_aop.xml_aop;

public class TestB {

    private String name;
    private String test;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void printThrowException(){
        this.name="wew";
        System.out.println("Exception raised");
//        throw new IllegalArgumentException();
    }
}
