package com.ranga.operators.loops;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
       //a=b;
      // b=a;
        int temp=b;
        b=a;
        a=temp;

        System.out.println(a);
        System.out.println(b);
    }
}
