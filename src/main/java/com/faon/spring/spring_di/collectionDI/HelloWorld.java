package com.faon.spring.spring_di.collectionDI;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloWorld {
    private List list;
    private Set set;
    private Map map;
    private Properties propreties;


    public List getList() {
        System.out.println("list"+list);
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        System.out.println("set"+set);
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        System.out.println("map"+map);
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getPropreties() {
        System.out.println("properties"+propreties);
        return propreties;
    }

    public void setPropreties(Properties propreties) {
        this.propreties = propreties;
    }
}
