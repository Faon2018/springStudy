package com.faon.spring.annotation.qualifier;

public class TestB {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  test(){
        System.out.println("testB test()"+name);
    }
}
