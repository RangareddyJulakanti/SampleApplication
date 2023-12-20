package com.oops.hasa.relationship.onetoone;

public class Test {
    public static void main(String[] args) {
        //name-ranga;
        //age=34
        //pancard: ARJPJ1234
        //name: Rangareddy Julakanti
        //DOB: 10-06-1987
        //TODO: Set data and display
        Person ranga=new Person();
        ranga.setName("ranga");
        ranga.setAge(34);
        ranga.setGender("MALE");

        PANCard rangaPanCard=new PANCard();
        rangaPanCard.setId("ARJPJ12345");
        rangaPanCard.setDOB("10-06-1987");
        rangaPanCard.setName("RANGAREDDY JULAKANTI");

        ranga.setPanCard(rangaPanCard);


        String rangaDetails=ranga.toString();

        System.out.println(rangaDetails);
        Person sai=new Person();
        sai.setName("sai");
        sai.setAge(30);
        sai.setGender("MALE");

        PANCard saiPAnCard=new PANCard();
        saiPAnCard.setId("ARJPJ54321");
        saiPAnCard.setDOB("10-06-1990");
        saiPAnCard.setName("SAI");
        sai.setPanCard(saiPAnCard);

        String saiDetails=sai.toString();
        System.out.println(saiDetails);
    }
}
