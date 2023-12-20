package com.oops;

public class MethodInvokation {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.marry();
        p.money();

        Child c=new Child();//you can invoke child class methods and parent class methods
        c.marry();
        c.money();

        Parent p1=new Child();//you can invoke parent class methods and child class override method
        p1.marry();




    }

}
