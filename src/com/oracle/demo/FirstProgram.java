package com.oracle.demo;

public class FirstProgram{ //a-z,A-Z,0-9_$
    byte k=127;//1 byte(8 bits)//-128 to +127
    int a=10;// 4 bytes(4*8 bits) // -2147483648 to 2147483647  //   2^3*1+2^2*0+2^1*1+2^0*0=  [1010] -2^31 to 2^31-1 //==2^3+2^1==32
    int b=2147483647; //4 bytes(4*8 bits)
    long c=9538953488L; //8 bytes//-2^63 to 2^63-1
    char d='A';//65  //2 bytes//(2*8==16 bits)1000001==64+1
    float f=100001111111111111111111111111111111111.1212324F;  //4 bytes(4*8=32 bits)
    double salary=100001111111111111111111111111111111111.5F;
    boolean isPermanentEmployee;
    static  int   g=10;
   public static void main(String[] args){
       int a=10;
       long c;
       System.out.println("Hello World");
   }


}
