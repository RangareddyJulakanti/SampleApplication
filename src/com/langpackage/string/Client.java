package com.langpackage.string;

public class Client {

    public static final String RANGA = "ranga";

    public static void main(String[] args) {
       // String s=new String("ranga");//1.Heap 2.Constant Pool
        String s2= "ranga";//Constant Pool
        //JVM will use garbage collector to remove un used objects from heap
        //System.out.println(s);
       // System.out.println(s2);

        //Important methods in string class
       //1. public char charAt(int index) ;//Returns the character locating at specific index.
        for(int i=0;i<s2.length();i++)
        System.out.println(s2.charAt(i));
        //2.public String concat(String str)//concat two strings
        System.out.println(s2.concat("reddy"));
        //3.equals method both String are same or not
        System.out.println(s2.equals("Ranga"));
        //4.public boolean equalsIgnoreCase(String anotherString) eventhough both strings are different cases it returns true
        System.out.println(s2.equalsIgnoreCase("RaNga"));

        // public String substring(int beginIndex) //returns the substring from begin index to end index of the string
        System.out.println("Rangareddy".substring(2));

        // public String substring(int beginIndex, int endIndex) returns the substring from begin index to end-1 index of the string
        System.out.println("Rangareddy".substring(2,6));
        // public String replace(char oldChar, char newChar)to replace every old character with new character
        System.out.println("Rangareddy".replace("a","@"));//
        System.out.println("RangAreddy".toLowerCase());//converts the all characters of the string to lowercase
        System.out.println("RangAreddy".toUpperCase());//converts the all characters of the string to uppercase
        System.out.println(" RangAreddy ".trim());//remove blank spaces present all beginning and ending of the string
        System.out.println("Rangareddy".indexOf("a"));//it returns the first occurrence of the specified character index
        System.out.println("Rangareddy".lastIndexOf("a"));//it returns the last occurrence of the specified character index
    }
}
