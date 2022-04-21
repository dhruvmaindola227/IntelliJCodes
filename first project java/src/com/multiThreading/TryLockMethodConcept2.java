package com.multiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockMethodConcept2 {
    public static void main(String[] args) {
        MultiT mt= new MultiT();
        mt.start();
        MultiT mt2= new MultiT();
        mt2.start();
    }
}

class MultiT extends Thread{
    static ReentrantLock rl= new ReentrantLock();
    @Override
    public void run() {
        do{
            try {
                if(rl.tryLock(2000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+" got lock");
                    Thread.sleep(8000);
                    rl.unlock();
                    System.out.println(Thread.currentThread().getName()+" released lock");
                    break;
                }
                else{
                    System.out.println(Thread.currentThread().getName()+ " unable to get lock");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(true);
    }
}
