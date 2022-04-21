package com.multiThreading;

import kotlin.math.MathKt;

public class ThreadLocalConcept2 {
    public static void main(String[] args) {
        CustomerThread ct1= new CustomerThread("thread 1");
        CustomerThread ct2= new CustomerThread("thread 2");
        CustomerThread ct3= new CustomerThread("thread 3");
        CustomerThread ct4= new CustomerThread("thread 4");
        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
    }
}

class CustomerThread extends Thread{
    static Integer custId=0;
    private static ThreadLocal<Object> tl = new ThreadLocal<>(){ //Anonymous inner class
        @Override
        protected Integer initialValue() {
            return ++custId;
        }
    };
    CustomerThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " executing and its custId is " + tl.get() );
    }
}
