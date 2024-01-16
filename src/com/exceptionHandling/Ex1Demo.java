package com.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1Demo {
    /**
     * An unwanted and unexpected event that disturbs normal flow of the execution
     * @param args
     *
     * If an exception is raised then how we have to handle the exception.
     *
     * Exception handling done through try and catch blocks
     */
    /**
     * Any exception raised at runtime only but compiler suggest to us please keep exception handling logic for the risk statements
     *
     * RuntimeException and Error their child classes are called un checked exceptions
     * remaining all exceptions are called checked exceptions
     * @param args
     */
    public static void main(String[] args) {//Main method handover to default exception handler jvm
        m1();//1
        System.out.println("main");//5
    }

    private static void m1() {
        m2();//2
        System.out.println("m1");//4
    }

    private static void m2() {
      //3

           System.out.println(10 / 0);//Here Arithmetic exception will create by the JVM and handover to m2()

        File f=new File("C:\\e-logo\\SystemLogo1.bmp");
        try {
            FileReader reader = new FileReader(f);
        }catch (FileNotFoundException e){
            System.out.println("path not found "+f.getAbsolutePath());
        }

        //name of the exception :java.lang.ArithmeticException
        // message:  / by zero
        //location of the exception:  line number 20
        System.out.println("m2");
    }
}
