package com.oops.template;

public class HousingClient {
    public static void main(String[] args) {
       /* HouseTemplate houseType = new WoodenHouse();
       //using template method
        houseType.buildHouse();*/
        System.out.println("************");
        HouseTemplate houseType = new TentHouse();
        houseType.buildHouse();
    }
}