package com.oops.interfaces;

public class SqlServerConnection implements DBConnection{
    @Override
    public void getConnection() {
        System.out.println("preparing SQLServer Connection");
    }
}
