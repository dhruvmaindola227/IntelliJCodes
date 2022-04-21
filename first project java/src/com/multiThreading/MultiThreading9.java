package com.multiThreading;

public class MultiThreading9 extends Thread{
    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("child thread");
        }
    }
}

class Demo1{
    public static void main(String[] args) throws InterruptedException {
        MultiThreading9.mt=Thread.currentThread();
        MultiThreading9 m9 = new MultiThreading9();
        m9.start();
        for (int i = 0; i < 2; i++) {
            System.out.println("main thread");
            Thread.sleep(1000);
        }
    }
}
