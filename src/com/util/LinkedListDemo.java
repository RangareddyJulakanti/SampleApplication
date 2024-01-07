package com.util;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");
        list.add(null);
        System.out.println(list.toString());

        list.addFirst("E");
        System.out.println(list.toString());
        list.removeFirst();
        System.out.println(list.toString());
        list.removeLast();
        System.out.println(list);
        list.removeAll(List.of("A","B"));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
