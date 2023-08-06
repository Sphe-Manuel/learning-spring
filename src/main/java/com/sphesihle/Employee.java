package com.sphesihle;


import lombok.Getter;

@Getter
public class Employee {

    private String name ;

    public void setName(String name) {
        this.name = name;
    }

    public void displayName(){
        System.out.println(name);
    }
}
