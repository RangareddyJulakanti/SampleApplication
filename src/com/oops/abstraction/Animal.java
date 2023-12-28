package com.oops.abstraction;

public abstract class Animal {
    protected String animalType;

    public Animal(String animalType) {
        this.animalType=animalType;
    }

    /**
     * Sound method implementation is based on child behaviour
     */
    public abstract void sound();
    //method name/functionality is same and logic is vary from one child to another child then we have to declare abstract method in parent
    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                '}';
    }
}
