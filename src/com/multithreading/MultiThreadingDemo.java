package com.multithreading;

public class MultiThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        //Order created , Movie ticket  booking, cancel

        //1.send sms to customer
        //2.send email to customer
        //MutiThreading: Executing several independent tasks simultaneously in a same program is called MultiThreading.
        //in MultiThreading every task executed by Thread.


        //MultiTasking: Executing sevaral independent tasks simultaneously in a same system(laptop,mobile) is called MultiTasking
        //in MultiTasking every task has some process Id(PID)


        //We can create a Thread using two ways one is Runnable and extending Thread Class
        /**
         * Runnable is an interface it has only one method called run()
         * Run() will execute by Thread automatically when we invoke start().
         */

        Thread t1=new Thread(new SendSMSTask());
        t1.start();
        t1.setName("SMS Thread");
        Thread t2=new Thread(new SendEmailTask());
        t2.start();
        t2.setName("EMail Thread");
        System.out.println(Thread.currentThread());
        t1.join();//Current running thread(Main thread) wants to wait until completion of t1 thread then use t1.join()
        t2.join();//Current running thread wants to wait until completion of t2 thread then use t2.join()
        System.out.println("Hi Iam Main");


        //parallel and concurrency

        // t1-->task1(30min)-->p1
        // t2-->task2(31 min)-->p2   max(30,31) min parallel

        //CPU 1 core processor concurrency
        //t1-->task1(30 min)->p1 10 mill         free     10milli
        //t2-->task2(31 min)->p1    free        10 mill    free    (30+31) 61 min
        /**
         * Ideal Threads count= Number Of processor*2
         */
    }
}
