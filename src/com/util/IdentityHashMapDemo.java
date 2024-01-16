package com.util;

import java.util.*;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<Employee,String> map=new TreeMap<>();

        map.put(new Employee(10,"ranga"),"IT");
        map.put(new Employee(20,"raju"),"IT");
        map.put(new Employee(10,"ranga"),"IT");
        System.out.println(map);

        Set<Employee> set=new TreeSet<>();
        set.add(new Employee(10,"ranga"));
        set.add(new Employee(20,"raju"));
        set.add(new Employee(10,"ranga"));
        System.out.println(set);
    }
}
