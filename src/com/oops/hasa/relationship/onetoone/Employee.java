package com.oops.hasa.relationship.onetoone;

public class Employee {
    private int id;
    private String name;
    private String email;
    private boolean isPFAccountAvailable;
    //By Default every class extends Object class which is there in Lang Package
    //For all java clasess the most commonly used functionality is define inside Object class hence Object class acts as a root for all java classes


    public boolean isPFAccountAvailable() {
        return isPFAccountAvailable;
    }

    public void setPFAccountAvailable(boolean PFAccountAvailable) {
        isPFAccountAvailable = PFAccountAvailable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isPFAccountAvailable=" + isPFAccountAvailable +
                '}';
    }
}
