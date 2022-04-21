package com.multiThreading;

public class MultiThreading2 {
    public static void main(String[] args) {
        MyThread t= new MyThread();
        t.start();
        t.run(6);//If we use this then there will be two threads. 1. thread main 2. thread t.
//        t.run();
        //this is just normal method calling and concept of threads is not being used.
                //Basically only one thread is working here and thats the thread main.

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");
    }
    //One can override the run method but since using a thread would mean that the start() method will always call the
    //no argument method only internally.
    public void run(int a){
        System.out.println(a);
    }
}
