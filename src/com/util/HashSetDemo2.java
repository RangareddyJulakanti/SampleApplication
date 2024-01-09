package com.util;

import com.langpackage.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        //APache POI
        LinkedHashSet<Student> students=new LinkedHashSet<>(10);//based on hashcode method equals method
        Student s1= new Student("ranga1",11);
        Student s2=new Student("ranga2",23);
        Student s3=new Student("ranga3",25);
        Student s4=new Student("ranga3",25);

        System.out.println(s1.hashCode()%10);//1
        System.out.println(s2.hashCode()%10);//3
        System.out.println(s3.hashCode()%10);//5
        System.out.println(s4.hashCode()%10);//5
        boolean s4Added= students.add(s4);
       boolean s1Added= students.add(s1);
       boolean s2Added= students.add(s2);
        boolean s3Added= students.add(s3);

        students.add(null);
        students.add(null);
        System.out.println(s1Added);
        System.out.println(s2Added);
        System.out.println(s3Added);
        System.out.println(s4Added);
        System.out.println(students);
    }
}
