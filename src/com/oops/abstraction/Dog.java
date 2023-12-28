package com.oops.abstraction;

public class Dog extends Animal {
    public Dog(String dog) {
        super(dog);
    }
    @Override
    public void sound(){
        System.out.println("Bow Bow");
    }

}
