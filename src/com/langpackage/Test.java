package com.langpackage;

import com.oops.hasa.relationship.onetoone.Employee;

public class Test {
    public static void main(String[] args) {
        Student ranga1=new Student("ranga1",1);
        Student ranga2=new Student("ranga2",2);
        Employee e2=new Employee();
       //
        System.out.println(ranga1.equals(ranga2));
       System.out.println(ranga1.hashCode());
        System.out.println(ranga2.hashCode());
    }
}
