package com.util;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        System.out.println(100%16);
        System.out.println((16-1)&100);
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);
        tree.add(50);
        tree.add(60);
        tree.add(70);
        System.out.println(tree.subSet(20,60));
    }
}
