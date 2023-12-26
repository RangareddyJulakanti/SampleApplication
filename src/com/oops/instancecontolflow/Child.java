package com.oops.instancecontolflow;

public class Child extends Parent{
    int x=100;//7//18
    {//8 //19
        System.out.println("Child first instance block");
        methodTwo();
    }
    public void methodTwo(){//9//20
        System.out.println("Child MethodTwo");
        System.out.println(x);
        System.out.println(y);
    }
    Child(){//10//22
        System.out.println("Child Constructor");
        System.out.println(x);
        System.out.println(y);
    }
    int y=200;//11//21
}
