package com.multithreading;

public class MultiThreadingDemo2 {
    /**Creating a thread in two ways
     * 1. Implementing  Runnable Interface and provide logic for run method(Your own runnable)
     * 2.Extending Thread class and override run method(provide your own task)
     * @param args
     */
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();//Start method is responsible to create a thread and execute run method based on MultiThreading algorithm
        t1.setName("Child");
        for(int i=0;i<10;i++){
            Thread.currentThread().setName("Main");
            System.out.println(Thread.currentThread().getName() +" Hi "+i);
        }
    }
}

class MyThread extends Thread{

   public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() +" Hi "+i);
        }
    }
}