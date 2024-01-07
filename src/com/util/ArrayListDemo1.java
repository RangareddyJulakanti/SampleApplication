package com.util;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();//10 default size new capacity=old capacity*3/2+1
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(null);
        l.add(10.2f);
        //System.out.println(l.get(1));
        //l.remove(1);
        System.out.println(l);
        l.set(1,1000);//replace

        System.out.println(l);
        l.remove(3);
        System.out.println(l);
        l.add(1,40);
        System.out.println(l);
    }
}
