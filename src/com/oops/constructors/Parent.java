package com.oops.constructors;

public class Parent {
    private String name;
    public Parent(String name) {
        this.name=name;
        System.out.println("Parent constructor");
    }
    public Parent(){
        System.out.println("Default constructor");
    }
    void m1(){
        System.out.println("parent m1");
    }
}
