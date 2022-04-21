package com.multiThreading;

public class MultiThreading5 extends Thread{
    @Override
    public void run() {
        System.out.println("run");
        System.out.println("This is being executed by the "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultiThreading5 m5=new MultiThreading5();
        m5.start();
        System.out.println(m5.getPriority());
        System.out.println("This thread is being run by "+ Thread.currentThread().getName());
    }


}
