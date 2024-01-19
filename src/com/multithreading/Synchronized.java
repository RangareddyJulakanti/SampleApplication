package com.multithreading;

public class Synchronized {
    /**
     * Synchronized is keyword applicable for methods and blocks but not for variables
     * If a method or block is synchronized then at a time only one thread is allow to execute tht method or block on the given object
     * By using synchronized keyword we can resolve data inconsistancy problems.
     * Main disadvantage of this keyword is increase the response time
     *
     * ***If a thread wants to execute any synchronized method on the given object  first it has to get the lock of that object
     * Once get the lock of that object then its allows to execute any synchronized method  on that object
     *
     * If synchronized method execution completes then automatically Thread release a lock
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Account incrementTask=new Account();
        Thread thread=new Thread(incrementTask);
        Thread thread2=new Thread(incrementTask);
        thread.start();
        thread2.start();
        //If two threads are working on same object then data inconsistency problems will raise
       /* for(int i=0;i<10;i++) {
            System.out.println("Main");
        }*/
    }
    static class Account implements Runnable{
        int amount=0;//Instance variables are not thread safe
        @Override
        public   synchronized void run() {
            for(int i=0;i<100;i++) {
                amount++;
                System.out.println(Thread.currentThread().getName()+ "==>"+amount);
            }
        }
        public   synchronized void m1() {
            for(int i=0;i<100;i++) {
                amount++;
                System.out.println(Thread.currentThread().getName()+ "==>"+amount);
            }
        }
        public    void m2() {
            for(int i=0;i<100;i++) {
                amount++;
                System.out.println(Thread.currentThread().getName()+ "==>"+amount);
            }
        }
    }
}
