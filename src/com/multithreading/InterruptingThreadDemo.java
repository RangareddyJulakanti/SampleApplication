package com.multithreading;

public class InterruptingThreadDemo {
    /**
     * If a thread can interrupte a sleeping or waiting state
     * @param args
     */
    public static void main(String[] args) {
        MyThread childThread=new MyThread();
        childThread.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() +" Hi "+i);
        }
        childThread.interrupt();//If Thread in sleeping state and invoke interrupt() on the same
        //then we will get exception (java.lang.InterruptedException: sleep interrupted)

    }

    static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("Hi");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
        }
    }
}


