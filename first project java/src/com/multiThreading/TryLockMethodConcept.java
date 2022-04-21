package com.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockMethodConcept {
    public static void main(String[] args) {
        MT1 mt1= new MT1("CT 1");
        MT1 mt1_1= new MT1("CT 2");
        mt1_1.start();
        mt1.start();
    }
}

class MT1 extends Thread{
    static ReentrantLock l= new ReentrantLock(); //only one copy of l can be created so all threads will work with this
                                                 //one ReentrantLock object.
    MT1(String name){
        super(name);
    }


    @Override
    public void run() {
        if(l.tryLock())
        {
            System.out.println(Thread.currentThread().getName()+ " "+ "got lock" );
        //CT1 will get lock and run this. CT2 will try to get lock and will fail, then will run the else block.
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie) {}
            System.out.println(Thread.currentThread().getName()+" "+ "sleeping is over");
        }
        else{
            System.out.println(Thread.currentThread().getName()+" "+ "didnt get lock");
        }
    }
}
