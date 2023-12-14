package com.ranga.operators;

public class Bitwise {
    public static void main(String[] args) {
        int a=10;//0100  q  N
        int b=5;//0101    ~N= -(N+1)
        //        -(N+1)
        System.out.println(~a);


        //? :
        int N=-16;

        String valueType=(N>0)?"Positive":"Negative";
        System.out.println("Type is "+valueType);

        int k=4;//0100
               //1000
        System.out.println(k<<1);

        //left sift operator (a<<n)==  a*2 power n;
        System.out.println(10<<2);//10*2 power 2;//40
        //right sift operator (a>>n)====a/2 power n;

        System.out.println(k>>1);
    }
}
