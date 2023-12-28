package com.oops.template;

public abstract class HouseTemplate {//We can't create object to abstract class directly through child class object its possible.
    //template method, final so subclasses can't override
    public  final  void buildHouse() {
        this.buildFoundation();
        this.buildPillars();
        this.buildWalls();
        this.buildWindows();
        System.out.println("House is built.");
    }

    //default implementation
    public void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();

    public abstract void buildPillars();

    public void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}