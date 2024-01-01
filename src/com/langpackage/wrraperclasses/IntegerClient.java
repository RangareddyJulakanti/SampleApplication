package com.langpackage.wrraperclasses;

public class IntegerClient {
    public static void main(String[] args) {
        //to wrap primitive into object form so that we can handle primitives also like objects
        int i=10;
        Integer j=i;
        Integer k=Integer.valueOf(i);//convert primitive value/string to Wrapper class object

        Float f=Float.valueOf(10.0f);
        f.shortValue();
        Integer ten=Integer.valueOf("10");
        System.out.println(ten);

        Employee e=new Employee();
        e.setName("ranga");
        System.out.println(e.toString());

        //Boolean b=Boolean.valueOf("TRUE");//true//covert primitive/string to wrapper class object called Boolean
        //Boolean b=Boolean.valueOf("true");//true
       // Boolean b=Boolean.valueOf("FALSE");//false
        //Boolean b=Boolean.valueOf("false");//false
       // Boolean b=Boolean.valueOf("abc");//false
        Boolean b=Boolean.valueOf(false);
        System.out.println(b);

        Integer a=Integer.valueOf(10);
        float c=a.floatValue();//xxxValue(); convert wrapper class object to primitive.
        System.out.println(c);

        Character d=Character.valueOf('A');
        char dd=d.charValue();//charValue(); convert Character wrapper class object to primitive char.
        System.out.println(dd);
        //parseXXX methods available in wrapper clasess.
        Long l=Long.parseLong("9908967875");//convert String to wrapper class object
        System.out.println(l);

    }
}
