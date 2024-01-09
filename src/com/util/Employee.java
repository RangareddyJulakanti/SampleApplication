package com.util;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee>{
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
       Employee e1=this;
       Employee e2=o;
       if(e1.id>e2.id){
           return 1;
       } else if (e1.id<e2.id) {
           return -1;
       }else{
           return 0;
       }
    }
}
