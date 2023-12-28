package com.oops.interfaces;

public class OracleConnection implements DBConnection {
    @Override
    public void getConnection() {
        System.out.println("URL,USERBNAME,OracleConnection");
    }
}
