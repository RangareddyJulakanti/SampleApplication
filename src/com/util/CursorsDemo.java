package com.util;

import com.langpackage.Student;

import java.util.*;

public class CursorsDemo {
    public static void main(String[] args) {
        //select,insert,delete,update

        //UI-->Java/SpringBoot-->DB-->java-->UI
        //Somabupal(ML)-->GE-->Bhart  -->stop-->fire-->jobs 6 months to 1 year


        //1.OOO (Object Oriented Programming(Java/Python) framework Spring Boot,Hibernate
        //2.DataBase(MongoDB/Oracle)
        //3.Scripting Language(JavaScript) framework Angular/React UI

         //fresher +1 ,2 3 years
        //AWS/Azure/GoogleCloud configuration one time activity
        //Docker Kubernetes
        //ML 20 Algorithms(Dessision tree/K mean Clustering,Lenear) (Numpy,Pandas Python)


        //We have 3 Cursors in java
        //If we want  to get Object by Object from the collection then we should go for Cursor.
        /**
         * 1.Enumeration//Vector or Stack  Legacy classes using this cursor we can do read only,we cannot do remove operation
         * 2.Iterator
         * 3.ListIterator
         */
        /*Vector<com.langpackage.Student> vector = getStudentDataFromDB();
        Enumeration<Student> enumeration=vector.elements();
        while(enumeration.hasMoreElements()){
           Student student= enumeration.nextElement();
           if(student.getRollno()%2==0)
            System.out.println(student);
        }*/

        //Iterator
        /**
         * We can use Iterator on any collection (ArrayList,LinkedList,Vector,Stack,Queue,Set,TreeSet,HashSet-->root interface Collection)
         * We can apply on any collection so we can say that this is the universal cursor.
         * By using this we can apply read as well as remove operation
         * We can create Iterator by using iterator() on any collection.
         */

        /*Vector<com.langpackage.Student> vector2 = getStudentDataFromDB();
        Iterator<Student> studentIterator=vector2.iterator();
        while (studentIterator.hasNext()){
           Student student= studentIterator.next();
           if(student.getRollno()%2==0){
               studentIterator.remove();
           }else{
               System.out.println(student);
           }
        }*/
        /**
         * ListIterator:
         * ListIterator is the child interface of Iterator.
         * we can get ListIterator by using listIterator() in list collection
         * By using ListIterator we can move either forward direction or backward direction Bidirectional cursor
         * Add/read/remove
         *
         * We can create ListIterator using listIterator() on any List and its child classes(ArrayList,LinkedList).
         * hasNext()// is it next element exists or not in collection
         * next()//get the next element
         * hasPrevious()//is it previous element exist or not in collection
         * previous()//get previous element
         * remove()//to remove element
         * add()//add element to collection object.
         */
        List<Student> students=getStudentDataFromDBList();
        System.out.println("Forward Direction");
        ListIterator<Student> listIterator=students.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Direction");
        while (listIterator.hasPrevious()){
            Student student=listIterator.previous();
            if(student.getRollno()%2==1)
              listIterator.remove();
            else{
                System.out.println(student);
            }
        }
        System.out.println(students);

    }

    public static Vector<Student> getStudentDataFromDB(){
        com.langpackage.Student ranga1=new com.langpackage.Student("ranga1",11);
        com.langpackage.Student ranga2=new com.langpackage.Student("ranga2",12);
        com.langpackage.Student ranga3=new com.langpackage.Student("ranga3",13);
        com.langpackage.Student ranga4=new com.langpackage.Student("ranga4",14);
        com.langpackage.Student ranga5=new com.langpackage.Student("ranga5",15);
        com.langpackage.Student ranga6=new com.langpackage.Student("ranga5",15);
        Vector<Student> l=new Vector<>();

        l.add(ranga1);
        l.add(ranga2);
        l.add(ranga3);
        l.add(ranga4);
        l.add(ranga5);
        l.add(ranga6);
        return l;

    }

    public static List<Student> getStudentDataFromDBList(){
        com.langpackage.Student ranga1=new com.langpackage.Student("ranga1",11);
        com.langpackage.Student ranga2=new com.langpackage.Student("ranga2",12);
        com.langpackage.Student ranga3=new com.langpackage.Student("ranga3",13);
        com.langpackage.Student ranga4=new com.langpackage.Student("ranga4",14);
        com.langpackage.Student ranga5=new com.langpackage.Student("ranga5",15);
        com.langpackage.Student ranga6=new com.langpackage.Student("ranga5",15);
        List<Student> l=new ArrayList<>();

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
