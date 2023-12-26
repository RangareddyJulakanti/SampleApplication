package com.oops.instancecontolflow;

public class Parent {
    int i=12;//1  //12
    {//2 //13
        System.out.println("first instance block");
        m1();
    }

    public void m1(){//3//14
        System.out.println(j);
    }

    {//4 //15
        System.out.println("second instance block");

    }
    Parent(){//5  //17
        System.out.println("Parent Constructor");
        System.out.println(i);
        System.out.println(j);
    }
    int j=20;//6//16
}
