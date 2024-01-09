package com.util;

public class Student {
    private Integer id;
    private String section;

    public Student(Integer id,String section) {
        this.id = id;
        this.section=section;
    }

    public Integer getId() {
        return id;
    }

    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", section='" + section + '\'' +
                '}';
    }
}
