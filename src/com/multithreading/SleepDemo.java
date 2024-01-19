package com.multithreading;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         *
         * If a thread dont want to perform any operation for a particular amount of time
         *  Then we should go for sleep.
         *  1000 milli Seconds is nothing but 1 sec
          */
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hi");
        Thread.sleep(2000);
        System.out.println("Hello");
        Thread.sleep(5000);
        System.out.println("World");
    }
}
