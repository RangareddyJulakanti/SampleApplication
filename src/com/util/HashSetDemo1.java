package com.util;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
    /*    HashSet<Integer> hashSet=new HashSet<>(10);//16 ,0.75
        hashSet.add(1);//1%10=   -->1
        hashSet.add(5);//5%10 --->5
        hashSet.add(3);//3%10--->3
        hashSet.add(4);//4%10  -->4
        hashSet.add(6);//6%10 --->6
        hashSet.add(7);//7%10-->7

        hashSet.add(10);//10%10--->0
        hashSet.add(8);//8%10-->8

        hashSet.add(9);//9%10--->9
        hashSet.add(2);//2%10-->2

        hashSet.add(121);//121%10-->1
       for(Integer i:hashSet){
           System.out.println(i);
       }*/

        HashSet<Integer> h=new HashSet<>(5);//2^3   =8 threshold  hashset size--> --   0,1,2,3,4,5,6,7
        // 8*0.75 fill ratio 6 buckets full new hashset with old capcity*2 8*2=16 = 2^4
        h.add(5);//5%8-->5
        h.add(2);//2%8-->2
        h.add(6);//6%8-->6
        h.add(15);//15%8-->7
        h.add(23);//23%8-->7
        h.add(16);//16%8-->0
        System.out.println(h.toString());//[16,2,5,6,15,23]
        //1000->(2^10)==1024 number of buckets threshold 1024*0.75 1024*3/4=768
        //new capacity=old capacity*2=1024*2  =2^11=2048
        HashSet<Integer> h2=new HashSet<>(15);//2^4==16 16*3/4-->12
        h2.add(100);//100%16->4
        h2.add(38);//38%16-->6
        h2.add(21);//21%16-->5
        h2.add(200);//200%16-->8
        h2.add(17);//17%16-->1
        h2.add(300);//300%16-->12
        h2.add(18);//18%16-->2
        System.out.println(h2);//17,18,100,21,38,200,300








    }
}
