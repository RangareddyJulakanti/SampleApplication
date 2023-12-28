package com.oops.interfaces;

public class MyChild extends Object implements MyInterface,MyInterface2 {
    @Override
    public void m1() {
        System.out.println("Child m1");
    }

    @Override
    public void m3() {
        System.out.println("Child m3");
    }
}
