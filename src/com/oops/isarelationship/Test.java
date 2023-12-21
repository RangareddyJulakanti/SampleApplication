package com.oops.isarelationship;

public class Test {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.methodOne();
       // p.methodTwo();//CE: methodTwo not found in Parent

        Child c=new Child();//What ever you have in parent class by default available to the child class
        c.methodTwo();
        c.methodOne();
        System.out.println(c.name);

        Child2 c2=new Child2();
        c2.methodOne();

        Parent p2=new Child2();//PArent reference can hold any type of its implemented child class object
        p2.methodOne();
       // p2.methodTwo();//CE: cannot find symbol  method methodTwo() Parent

       // Child c3=new Parent();//CE: incompatible types: com.oops.isarelationship.Parent cannot be converted to com.oops.isarelationship.Child
    }
}
