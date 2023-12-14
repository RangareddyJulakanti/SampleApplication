package com.ranga.operators.loops;

public class WhileDemo {

    public static void main(String[] args) {
        int num=1234;

       /* int i=1;
        int tableNumber=10;
        while(i <= 10 ){
            if(i%2==0) {
                System.out.println(tableNumber + "*" + i + "=" + tableNumber * i);
            }
            i++;
        }*/

       /* int i=10;
        while(i>0){
            if(i%2==0) {
                System.out.println("i value" + i);
            }
            i--;
        }*/
        int i=1;
        while(i<=10){
            if(!(i%2==0)) {
                System.out.println("i value" + i);
            }
            i++;
        }
    }
}
