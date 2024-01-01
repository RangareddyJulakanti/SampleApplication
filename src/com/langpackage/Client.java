package com.langpackage;

public class Client {
    public static void main(String[] args) {
        Student ranga=new Student("ranga",1);
        Student sai=new Student("Sai",2);
        System.out.println(ranga.toString());
        //Here Object class toString()method got executed which is internally calls
        // Student class HashCode method

        //If we are overriding toString() it may not call toString() of Object class and HashCode() of the Student class
        System.out.println(sai.toString());
    }
}
