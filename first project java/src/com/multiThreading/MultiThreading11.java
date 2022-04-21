package com.multiThreading;

public class MultiThreading11 extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("fajfnad");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println("got interrupted.");
        }
    }
}

class Demo2{
    public static void main(String[] args) {
        MultiThreading11 m11= new MultiThreading11();
        m11.start();
        m11.interrupt();
    }}
