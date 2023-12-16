package com.ranga.operators.loops;

public class SecondHighest {
    public static void main(String[] args) {
        int a[]={10,20,40,30,100,90,101,10};
        int index =0;
        int f=0;
        int s=0;
        while(index<a.length){
            if(a[index]>f){
                int temp=f;
                f=a[index];
                s=temp;
            }else if(a[index]>s)
            {
                s=a[index];
            }
            index++;
        }
        System.out.println(f);
        System.out.println(s);
    }
}
