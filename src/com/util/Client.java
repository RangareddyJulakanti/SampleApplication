package com.util;

import com.langpackage.Student;
import com.oops.hasa.relationship.onetoone.Employee;

public class Client {
    public static void main(String[] args) {

        Student[] students = getStudentDataFromDB();
        for(Student s:students){
            System.out.println(s.toString());
        }



    }
    public static   Student[] getStudentDataFromDB(){
        Student ranga1=new Student("ranga1",11);
        Student ranga2=new Student("ranga2",12);
        Student ranga3=new Student("ranga3",13);
        Student ranga4=new Student("ranga4",14);
        Student ranga5=new Student("ranga5",15);
        Student[] data=new Student[5];
        data[0]=ranga1;
        data[1]=ranga2;
        data[2]=ranga3;
        data[3]=ranga4;
        data[4]=ranga5;
        return data;

    }
}
