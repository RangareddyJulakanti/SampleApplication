package com.oops;

public class C2 {
    public static void main(String[] args) {
       C1 c=new C1();
       c.m1();
       C2 c2=new C2();
        System.out.println(System.identityHashCode(c2));
       c2.m2();

       C2.m4();
    }
    public void m2(){
        System.out.println("m2");
        System.out.println(System.identityHashCode(this));
        m3();
        C1 c=new C1();
        c.m1();
    }
    public void m3(){
        System.out.println(System.identityHashCode(this));
        System.out.println("m3");
        C2.m4();
        this.m5();
    }

    public static void m4(){
        System.out.println("m4");
    }

    public void m5(){

    }
}
