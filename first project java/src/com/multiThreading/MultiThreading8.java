package com.multiThreading;

public class MultiThreading8 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
            }
        }

}

class Demo{
    public static void main(String[] args) throws InterruptedException {
        MultiThreading8 m8=new MultiThreading8();
        m8.start();
//        m8.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
