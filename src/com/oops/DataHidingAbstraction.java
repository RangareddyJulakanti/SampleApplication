package com.oops;

 public  class DataHidingAbstraction {
    public static void main(String[] args) {
        Account account=new Account();
        account.setName("Ranga");
        account.setNo(1234);
        account.setAge(17);
        account.setEmail("ranga@gmail.com");
        int hashcode=System.identityHashCode(account);
        System.out.println(hashcode);
        System.out.println(account.getEmail());
        System.out.println(account.getAge());
    }
}
