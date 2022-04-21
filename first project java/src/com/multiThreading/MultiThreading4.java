package com.multiThreading;

public class MultiThreading4 extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MultiThreading4 m4=new MultiThreading4();
        System.out.println(m4.getName());
        Thread.currentThread().setName("Main thread"); //sets a name to a given thread
        m4.setName("m4");
        System.out.println(Thread.currentThread().getName());
        System.out.println(m4.getName());
    }
}
