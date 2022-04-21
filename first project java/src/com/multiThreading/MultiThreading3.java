package com.multiThreading;

public class MultiThreading3 {
    public static void main(String[] args) {
        NewThread t=new NewThread();

        t.start();
    }
}
class NewThread extends Thread{
    @Override
    public synchronized void start() {
        super.start();
//        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run()");
    }
}
