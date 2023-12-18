package com.ranga.operators.loops;

public class ForEach {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        for(int num : a){//jdk 5 version
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
