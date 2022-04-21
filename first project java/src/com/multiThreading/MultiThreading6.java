package com.multiThreading;

public class MultiThreading6 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread called for the "+ (i+1) +"th time");
        }
    }

    public static void main(String[] args) {
        MultiThreading6 m6= new MultiThreading6();
        m6.setPriority(10);
        m6.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread called for the "+ (i+1)+ "th time");
        }
    }
}
