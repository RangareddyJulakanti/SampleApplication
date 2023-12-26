package com.oops.constructors;

public class Child extends Parent {
    int i=10;
  /*  public Child() {
        super();
        System.out.println("Child Constructor");
    }*/
      public Child() {
        //super("ranga");
         // super();
          this("ranga");
     }
    public Child(String name) {
        super(name);
        //
      //super();
      System.out.println("child constructor");

    }
    void m2(){
        m1();
    }
    public static void m3(){
          Child child=new Child();
          child.m1();
          System.out.println(child.i);
    }
}
