package com.boxing;

public class Client {
    public static void main(String[] args) {
        int i=10;

        Integer j=i;//Integer.valueOf(i)//autoboxing 1.5
        System.out.println(j);

        Integer m=20;
        float n=m;//m.floatValue();
        long o=m;//m.longValue();  //Auto Unboxing
        System.out.println(n);

        Character c='a';//Character.valueOf('a');autoboxing
        char d=c;//c.charValue();   //AutoUnboxing

    }
}
