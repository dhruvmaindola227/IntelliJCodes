package com.multiThreading;

public class MultiThreading7 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child Thread");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        MultiThreading7 mt= new MultiThreading7();
        mt.start();
        mt.setPriority(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
