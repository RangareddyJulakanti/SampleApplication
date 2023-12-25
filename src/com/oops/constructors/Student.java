package com.oops.constructors;

public class Student {
    public String name;

   /* {
        //instance block
        System.out.println("instance block 1");
    }

    {
        //instance block
        System.out.println("instance block 2");
        m2();
    }*/

    private void m2() {
        System.out.println("instance method m2");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
