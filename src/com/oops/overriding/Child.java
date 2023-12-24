package com.oops.overriding;

public class Child extends Parent{

    @Override
    public void marry(){
        System.out.println("Child marry method");
    }
    //jdk1.5 covariant return types also allowed
    public Long m1(){
        System.out.println("Parent m1");
        return 10l;
    }
     void m2(){
        System.out.println("child m2 method");
    }
   /* public static void m3(){
        System.out.println("child m3");
    }*/
}
