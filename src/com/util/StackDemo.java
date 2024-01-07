package com.util;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //push //to add an element to stack
        //addElement


        //pop  //return and remove top element of the stack
        //peek//return top of the stack without removal
        //empty()
        //search()
        Stack<String> stack=new Stack<>();
                             //index  //offset
        stack.push("A");//0       4
        stack.push("B");//1       3
        stack.push("C");//2       2
        stack.push("D");//3       1

        System.out.println(stack.search("A"));
        System.out.println(stack.search("Z"));
         int size=stack.size();
        for(int i=0;i<size;i++){
            System.out.println(stack.pop());
        }

    }
}
