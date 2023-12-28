package com.oops.template;

public class TentHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building walls with Iron plates");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Iron plates");
    }
    public void buildFoundation() {
        System.out.println("Building foundation with Iron plates");
    }

}
