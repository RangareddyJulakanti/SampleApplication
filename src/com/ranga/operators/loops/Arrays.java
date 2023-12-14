package com.ranga.operators.loops;

public class Arrays {

    public static void main(String[] args) {
        int [] ids= new int[4];//instatiation // -2 power 31 to +2 power 31 -1
        ids[0]=10;//initialization
        ids[1]=20;
        ids[2]=30;
        ids[3]=40;
      //  ids[4]=50;
        int length=ids.length;
        int [] c={2,3,4,5,6,7};
        int index=0;
        while(index<c.length){
            if(c[index]%2==0) {
                System.out.println(c[index]);
            }
            index++;
        }

    }
}
