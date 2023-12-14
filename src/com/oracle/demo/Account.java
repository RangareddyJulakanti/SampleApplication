package com.oracle.demo;

public class Account {
    private  long accountNumber;
    private String accountName;

    private String address;

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAddress() {
        return address;
    }


    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String args[])
    {
        Account rangaAccount = new Account();
        rangaAccount.setAccountNumber(123L);
        rangaAccount.setAccountName("Ranga");
        rangaAccount.setAddress("HYD");

        Account saiAccount = new Account();
        saiAccount.setAccountNumber(456L);
        saiAccount.setAccountName("Sai");
        saiAccount.setAddress("US");

        Account sinduAccount = new Account();
        sinduAccount.setAccountNumber(789L);
        sinduAccount.setAccountName("Sindu");
        sinduAccount.setAddress("US");

        System.out.println(saiAccount.getAccountName());
        System.out.println(saiAccount.getAccountNumber());
        System.out.println(saiAccount.getAddress());

    }


}
