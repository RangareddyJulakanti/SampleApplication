package com.oops;

public class Account {
    private int accountNumber;
    private String accountName;
    private int age;
    private  String email;
    //Data Hiding

    //Validation purpose
    //Hide the information of the class
    //Avoid invalid entry/input

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")&&email.contains(".")) {
            this.email = email;
        }else{
            System.out.println("Invalid email "+email);
        }
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }else{
            System.out.println("In valid age " +age);
        }
    }

    public void setNo(int acNo){
        this.accountNumber=acNo;
    }
    public void setName(String acName){
        this.accountName=acName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAge() {
        return age;
    }
    //Abstraction

    //DataHiding+Abstraction=Encapsulation
}
