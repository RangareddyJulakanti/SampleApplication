package com.exceptionHandling;

public class Ex3Demo {
    public static void main(String[] args)  {
         String name = args[0];
         Integer age = Integer.valueOf(args[1]);
         try {
             validateAge(age);//TODO: we have to validate user provided data
         }catch (InvalidAgeException exception){
             System.out.println(exception.getMessage());
             return;
         }
         Person p=new Person(name,age);
         System.out.println(p);
    }

    private static void validateAge(Integer age) {
        if(age<0){
            throw  new InvalidAgeException("Please provide valid number for age"+age);
        }
    }
//When we throw a checked exception then throws is mandatory for that method
    //Then caller method is responsible for handling the same

}
