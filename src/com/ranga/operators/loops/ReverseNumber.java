package com.ranga.operators.loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=12345678;


        //num>0-->1234>0
        //num%10-->1234%10-->4=r
        //reversNum=reversNum*10+r==0*10+4==4
       //num=num/10-->1234/10==123

        //num>0==123>0
        //num%10-->123%10===>3
        //reversNum=reversNum*10+r=4*10+3=43
        //num=num/10==>123/10==12

        //num>0==12>0
        //num%10==>12%10==>2
        //reversNum=reversNum*10+r=43*10+2=432
        //num=num/10=12/10==1

        //num>0==1>0
        //num%10==1%10-->1
        //reversNum=reversNum*10+r=432*10+1=4321
        //num=num/10==1/10=0

        //num>0==0>0==false



        int r=0;
        int reversNum=0;
        while(num>0){
            r=num%10;
            reversNum=reversNum*10+r;
            num=num/10;
        }
        System.out.println(reversNum);
    }
}
