package com.ranga.operators;

import com.jpmc.employee.Employee;
import com.sun.tools.javac.Main;

public class IncrementDecrement {
    public static void main(String[] args) {
        int y=10;

        int x=y++;//Post increment//++ (y=y+1);
        System.out.println(x);
        System.out.println(y);

        int a=11;
        int b= ++a;//Pre Increment  //a=a+1;
        System.out.println(a);
        System.out.println(b);


        //Arithmentic operators we can apply for two variables
        //=
        byte k=10;
        byte o=k++;
        int  c=k+1;// -128 to +127//byte+byte always int
        short l=10;
        int m=l+11;//short+short always int

        int n=k+m;//byte+int =byte


      // byte-->short-->int-->long
        //    -->char-->        --float->double
      char p='A';//65
      int q=p+'B';//66
    // System.out.println(q);
        //System.out.println(10/0);
        double r=0.0;
       System.out.println(r/0);
       // System.out.println(0/0);
        System.out.println(10<Float.NaN);

        Employee ranga  =  new Employee();
        Employee sindu= new Employee();
        System.out.println(ranga!=sindu);


    }
}
