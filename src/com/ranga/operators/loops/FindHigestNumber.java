package com.ranga.operators.loops;

public class FindHigestNumber {
    public static void main(String[] args) {
     /*   int a[]={10,5,8,20,23,15};
        //a[0]>temp  10>0  true --> temp=10-->temp=a[0]
        //a[1]>temp  5>10 false
        //a[2]>temp  8>10 false
        //a[3]>temp  20>10 true -->temp=20-->temp=a[3]
        //a[4]>temp  23>20 true -->temp=23-->temp=a[4]
        //a[5]>temp  15>23 false

        int index =0;
        int temp=0;
        while(index<a.length){
            if(a[index]>temp){
                temp=a[index];
            }
            index++;
        }
        System.out.println(temp);*/

        int a[]={10,8,11,9};
        //a[0]>highest=10>0 true highest=a[0]--->highest=10
        //a[1]>highest=8>10 false
        //a[2]>highest=11>10 true highest=a[2]--->highest=11
        //a[3]>highest=9>11 false

        int index =0;
        int highest=0;
        while(index<a.length){
            if(a[index]>highest){
                highest=a[index];
            }
            index++;
        }
       /* int a[]={10,8,11,9,20,30,170,80,30};
        int highest=0;
        int index;
        for(index=0;index<a.length;  index++){
            if(a[index]>highest){
                highest=a[index];
            }
        }
        System.out.println(highest);*/

    }
}
