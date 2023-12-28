package com.oops.staticcontrolflow;

public class Child extends Base{
    static int x=100;//7 //17
    static{//8 //18
        methodTwo();
    }

    private static void methodTwo() {//9 //19
        System.out.println(y);
    }


    static int y=200;//10 //20

 public static void main(String[] args) {//11 //21


       /* *  When ever we are running child class the below steps will follow one by one
         *  1.identification of the static members(methods/variables/blocks) from parent  to child
         *  2.execution of static variables/blocks from parent to child
         *  3.execution of child class main method if its available else parent class main method
         */

        System.out.println("Child main method");
    }

}
