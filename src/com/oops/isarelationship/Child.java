package com.oops.isarelationship;

public class Child extends Parent{
   //Logically we can get all parent methods and variables if those are public
  public void methodTwo(){
     System.out.println("methodTwo");
   }

   public void methodOne(){
      System.out.println("Child class methodOne");
   }
}