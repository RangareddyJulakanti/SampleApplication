package com.oops.staticcontrolflow;

public class Base {
    static int i=10;//1 //12

    static{//2 //13
        System.out.println("first static block");
        methodOne();
    }
    public static void methodOne(){//3 //14
        System.out.println(j);
    }

    static{//4 //15
        System.out.println("second static block");
    }

   static int j=20;//5 //16

    public static void main(String[] args) {//6 //21


        /**
         *  //When we load a class the below steps will execute by the JVM before invoking main()
         *  1.identification of the static members(methods/variables/blocks) from top to bottom
         *  2.execution of static variables/blocks from top to bottom
         *  3.execution of main method
         */
        System.out.println("Base class main method");
        System.out.println(i);
        System.out.println(j);
    }
}
