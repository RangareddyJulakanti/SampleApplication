package com.ranga.operators.loops;

public class DigitsSum {
    public static void main(String[] args) {
       // int num=123;

        //123%10==3
        //123/10=12
        //12%10 ==2
        //12/10==1
        //1%10  ==1

        //is Prime   5
        //1,2,3,4,5

        //is Prime   7
        //1,2,3,4,5,6,7

       /* int num=29;
        int i=1;
        int r=0;
        while(i<=num){
            if(num%i==0){
                r++;
            }
            i++;
        }
        if(r==2){
            System.out.println("Given Number "+num+" is  prime");
        }else{
            System.out.println("Given Number "+num+" is not prime");
        }*/



        //123%10==3
        //123/10=12
        //12%10 ==2
        //12/10==1
        //1%10==1
        int num=104567;
        int digitSum=1;
        int r=0;
        while(num>0){
            r=(num%10);
            if(r!=0) {
                digitSum = digitSum *r;
                System.out.println(digitSum);
            }
            num=num/10;
        }
        System.out.println("multiply all digits "+digitSum);
    }
}
