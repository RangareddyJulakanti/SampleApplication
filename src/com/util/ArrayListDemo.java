package com.util;

import com.langpackage.Student;
import com.oops.hasa.relationship.onetoone.Employee;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> l=getStudentDataFromDB();
        //l.remove(2);
        for(Student s:l){
            System.out.println(s.toString());
        }
        //l.clear();
        System.out.println(l.toString());
    }
    public static   ArrayList<Student> getStudentDataFromDB(){
        Student ranga1=new Student("ranga1",11);
        Student ranga2=new Student("ranga2",12);
        Student ranga3=new Student("ranga3",13);
        Student ranga4=new Student("ranga4",14);
        Student ranga5=new Student("ranga5",15);
        Student ranga6=new Student("ranga5",15);
       ArrayList<Student> l=new ArrayList<>();

        l.add(ranga1);
        l.add(ranga2);
        l.add(ranga3);
        l.add(ranga4);
        l.add(ranga5);
        l.add(ranga6);
        l.add(ranga6);
        return l;

    }
}
