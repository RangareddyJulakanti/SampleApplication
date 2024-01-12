package com.langpackage;

public class Student {
    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    /**
     * We can use toString() while priting object reference we want to print internal information.
     * HashMap,HashSet.
     * @return
     */
    public String toString() {
        return "name = "+name+" rollno ="+rollno;
    }
    public  int hashCode(){
        return rollno;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Student) {//obj should be not null and it should be Student type
            Student s1 = this;
            Student s2 = (Student) obj;//ClassCastException if we pass other than Student
            //obj is null then we will get NullPointerException

            if (s1.name == s2.name && s1.rollno == s2.rollno) {
                return true;
            }
            return false;
        } else {
          return false;
       }

    }
}
