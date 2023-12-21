package com.oops.hasa.relationship.onetoone;

public class Verify {
    public static void main(String[] args) {
        Employee e=new Employee();
       // e.setPFAccountAvailable(true);
        //e.setPfAmount(100000.0);
        e.setId(123);
        e.setName("RANGA");
        e.setPFAccountAvailable(false);
        System.out.println(e.toString());
        System.out.println(e.hashCode());
        System.out.println(Integer.toHexString(1831932724));
       /* ContractEmployee contractEmployee=new ContractEmployee();
        contractEmployee.setPFAccountAvailable(false);
        contractEmployee.setName("RAJU");
        FulltimeEmployee fulltimeEmployee=new FulltimeEmployee();
        fulltimeEmployee.setPFAccountAvailable(true);
        fulltimeEmployee.setPfAmount(100000.0);
        fulltimeEmployee.setName("RANGA");


        Employee e1=new FulltimeEmployee();
        e1.setName("ranga");
        e.getName();*/
    }
}
