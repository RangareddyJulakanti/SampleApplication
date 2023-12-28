package com.oops.abstraction;

public class Cat extends Animal {

    public Cat(String animalType) {
        super(animalType);
    }

    @Override
    public void sound(){
        System.out.println("Maw Maw");
    }


}
