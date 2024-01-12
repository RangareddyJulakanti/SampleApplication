package com.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {
    public static void main(String[] args) {
        /**
         *
         *  Interface Map{
         *
         *     Interface  Entry{
         *
         *         Key key;//key is always unique in map
         *         Value value;//value can be duplicate in any map
         *
         *     }
         *
         *  }
         *  TreeMap,HashMap,LinkedHashMap,IdentityHashMap,WeakHashMap
         *  Keys  always unique in any map
         *  in case if we try to add an entry with duplicate key then old value replace with new value
         */

        Map<Long,Person> map=new HashMap<>();//HashTable 11 0.75 //2 power 4 //16 default bucket 16*3/4=12 buckets 16*2==32 buckets
        map.put(10L,new Person("Ranga","KNL"));//entry
        map.put(20L,new Person("Hari","KNL"));//entry
        map.put(30L,new Person("Raj","KNL"));//entry
        map.put(50L,new Person("Venkat","KNL"));//entry
        map.put(40L,new Person("Mohan","KNL"));//entry
        map.put(5L,new Person("Venkat","KNL"));//entry
        System.out.println(10L%16);//10
        System.out.println(20L%16);//4
        System.out.println(30L%16);//14
        System.out.println(50L%16);//2
        System.out.println(40L%16);//8
        System.out.println(5L%16);//5
        System.out.println(map);//50L,20L,5L,40L,10L


     /*   Map<Person,Long> map1=new HashMap<>(16);
        //2 power 4 //16 default bucket 16*3/4=12 buckets 16*2==32 buckets
        Person p1=new Person("Ranga","KNL");
        Person p2=new Person("Hari","KNL");
        Person p3=new Person("Raj","KNL");
        Person p4=new Person("Venkat","KNL");
        Person p5=new Person("Mohan","KNL");

        map1.put(p1,10L);//entry
        map1.put(p2,20L);//entry
        map1.put(p3,30L);//entry
        map1.put(p4,50L);//entry
        map1.put(p5,40L);//entry
        System.out.println(15&p1.hashCode());//0
        System.out.println(15&p2.hashCode());//10
        System.out.println(15&p3.hashCode());//12
        System.out.println(15&p4.hashCode());//4

        System.out.println(15&p5.hashCode());//12

        System.out.println(map1);//12,12,10,4,0
*/
        TreeMap<Student,Integer> t3=new TreeMap(new StudentIdComparator());//custom sorting order //predefined class
        //TC log(n) search, insert, deletion//1024 elements 2 power 10  -->10
        t3.put(new Student(12,"A"),1);
        t3.put(new Student(8,"F"),2);
        t3.put(new Student(5,"C"),3);
        t3.put(new Student(8,"B"),4);
        t3.put(new Student(4,"D"),4);
        t3.put(new Student(3,"E"),5);
        t3.remove(new Student(3,"E"));
        System.out.println(t3);

    }
}
