package com.oops.abstraction;

public class Test {
    public static void main(String[] args) {
        Cat c=new Cat("Cat");
        //Dog d=new Dog("Dog");
        perform(c);
    }

    private static void perform(Animal a) {
        a.sound();
        System.out.println(a.toString());
    }
}
