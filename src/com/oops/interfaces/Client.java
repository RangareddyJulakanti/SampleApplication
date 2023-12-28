package com.oops.interfaces;

public class Client {
    public static void main(String[] args) {
       /*MyInterface m=new MyChild();
       m.m1();*/
        DBConnection con=new SqlServerConnection();
        con.getConnection();
    }
}
