package com.oops.overriding;

public class Test {
    public static void main(String[] args) {
        Parent p=new Child2();
        p.marry();
        p.m2();
        p.m3();
        Child c3=new Child();
        c3.m3();
    }
}
