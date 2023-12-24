package com.oops.overriding;

public class Child2 extends Parent{
    @Override
    public void marry(){
        System.out.println("Child2 marry method");
    }
    void m2(){
        System.out.println("Child2 m2");
    }
    public static  void m3(){
        System.out.println("parent m3");
    }
}
