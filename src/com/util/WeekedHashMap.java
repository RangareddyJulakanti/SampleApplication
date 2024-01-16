package com.util;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeekedHashMap {
    public static void main(String[] args) throws InterruptedException {
        Map<Long,Student> map=new WeakHashMap<>();
        Student s1=new Student(10,"A");
        map.put(9538953488L,s1);
        Student s2=new Student(11,"B");
        map.put(9538953489L,s2);
        System.out.println(map);
        Runtime.getRuntime().gc();
        System.out.println(map);
    }
}
