package com.multithreading;

public class SendEmailTask implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread()+"Sending Email....."+i);
        }
    }
}
