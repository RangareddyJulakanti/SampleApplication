package com.util;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //Duplicates not allowed
        //elements should be comparable(Integer implements Comparable) else will get classcast exception
        //for default sorting order
        //All wrapper+string+stringBuffer classes are comparable
        //Comparable class is available in java.lang
        // public int compareTo(T o);//it will use by Treeset for sorting
        TreeSet<Integer> t=new TreeSet<>();
        t.add(10);
        t.add(18);
        t.add(45);
        t.add(-10);
        t.add(5);
        t.add(4);
        System.out.println(t);
        TreeSet<Employee> t1=new TreeSet<>();
        t1.add(new Employee(12,"sindhu"));
        t1.add(new Employee(11,"sai"));
        t1.add(new Employee(13,"krishna"));
        t1.add(new Employee(10,"ranga"));
        t1.add(new Employee(12,"sindhu"));

        System.out.println(t1.toString());
       // If my element class is predefined and not comparabale then we will get java.lang.ClassCastException
        //at the same time i cant implement comparable due to its a predefined class(not editable)
        // then we have to pass custom class which is implements Comparator
        //Comparator is an interface which is available in java.util. package
        //it has a abstract method called compare
        // int compare(T o1, T o2);
        //Treeset will use studentIdComparator to sort the students based on their id
      /*  TreeSet<Student> t3=new TreeSet<>(new StudentIdComparator());
        t3.add(new Student(12));
        t3.add(new Student(5));
        t3.add(new Student(8));
        t3.add(new Student(4));
        t3.add(new Student(3));
        t3.add(new Student(8));
        System.out.println(t3);*/


        TreeSet<Student> t3=new TreeSet<>(new StudentSectionComparator());
        t3.add(new Student(12,"A"));
        t3.add(new Student(8,"F"));
        t3.add(new Student(5,"C"));
        t3.add(new Student(8,"B"));
        t3.add(new Student(4,"D"));
        t3.add(new Student(3,"E"));

        System.out.println(t3);
    }
}
