package com.ranga.operators.flowcontrol;

import java.sql.SQLOutput;

public class IfElseDemo {

    public static void main(String[] args) {

       int rank=11000;
        if(10>rank){
            System.out.println("CBIT");
        } else if(100>rank){

            System.out.println("OU University");
        } else if(1000>rank){
            System.out.println("JNTU University");
        }else{
            System.out.println("KU");
        }

        int a=14;
        int b=18;
        int c=20;

        /*if(a>b && a>c){
            System.out.println(a+" is greater");
        }else if(b>a && b>c){
            System.out.println(b+" is greater");
        }else{
            System.out.println(c+" is greater");
        }*/

        if(a>b){

            if(a>c) {//a is greater
                System.out.println(a + "is greater");
            }
            else{
                System.out.println(c+ " is greater");
            }
        }else{
            if(b>c){
                System.out.println(b +" is greater");
            }else{
                System.out.println(c +"is greater");
            }

        }
    }
}
