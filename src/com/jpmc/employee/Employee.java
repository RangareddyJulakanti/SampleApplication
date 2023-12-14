package com.jpmc.employee;

public class Employee {
    private String id;
    private String name;

    private double salary;

    public static String organization;

    public void setId(String id){
        this.id=id;
    }
    public void setName(String employeeName){
       this.name=employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee.organization="JPMC";
     Employee ranga  =    new Employee();
     ranga.setId("10");
     ranga.setName("RangaReddy");
     ranga.setSalary(1000000.50);

        System.out.println(ranga.getId());
        System.out.println(ranga.getName());
        System.out.println(ranga.getSalary());

    // ranga.setSalary(1000000);
     //Employee sai= new Employee();

    }

}
