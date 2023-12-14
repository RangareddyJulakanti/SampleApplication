package com.ranga.operators.flowcontrol;

public class SwitchDemo
{
    public static void main(String[] args) {
        int rank=10;
/*        if(10>rank){
    System.out.println("CBIT");
} else if(100>rank){

    System.out.println("OU University");
} else if(1000>rank){
    System.out.println("JNTU University");
}else{
    System.out.println("KU");
}*/
       int days=0;// byte ,char,short, int(jdk 4)+string (jdk7)
        switch(days){
            case 1:{
                System.out.println("SUNDAY");
                break;
            }
            case 2:{
                System.out.println("MONDAY ");
                break;

            }
            case 3:{
                System.out.println("TUESDAY");
                break;
            }
            case 4:{
                System.out.println("WEDNESDAY");
                break;
            }
            case 5:{
                System.out.println("THURSDAY");
                break;
            }
            case 6:{
                System.out.println("FRIDAY");
                break;
            }
            case 7:{
                System.out.println("SATURDAY");
                break;
            }
            default:
                System.out.println("IN VALID INPUT");

        }



        String day="SAT";// byte ,char,short, int(jdk 4)+string (jdk7)
        final String sat="SAT";
        switch(day){
            case "SUN":{
                System.out.println("SUNDAY");
                break;
            }
            case "MON":{
                System.out.println("MONDAY ");
                break;

            }
            case "TUE":{
                System.out.println("TUESDAY");
                break;
            }
            case "WED":{
                System.out.println("WEDNESDAY");
                break;
            }
            case "THU":{
                System.out.println("THURSDAY");
                break;
            }
            case "FRI":{
                System.out.println("FRIDAY");
                break;
            }
            case sat:{
                System.out.println("SATURDAY");
                break;
            }
            default:
                System.out.println("IN VALID INPUT");

        }
    }
}
