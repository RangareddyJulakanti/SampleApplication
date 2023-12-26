package com.oops.instancecontolflow;

public class Test {
    public static void main(String[] args) {
        /**
         * For each object creation the below steps will follow for a specific class
         * 1.Identification of instance members(variables,methods, blocks) from top to bottom.
         *  2.Execution of instance variables/blocks  from top to bottom
         * 3.execution of constructor
         */
        Parent parent=new Parent();
        /**
         * For each child object creation we need to follow the  below steps
         * 1.Identification of instance members(variables,methods, blocks) from parent to child.
         *
         *  2.Execution of instance variables/blocks only parent class
         *  3.execution of  parent  constructor
         *
         *  4.Execution of instance variables/blocks only child class
         *  5.execution of child constructor
         */
        Child child=new Child();
    }
}
