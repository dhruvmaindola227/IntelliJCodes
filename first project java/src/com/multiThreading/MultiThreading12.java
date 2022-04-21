package com.multiThreading;

import java.util.Arrays;

public class MultiThreading12 {
    public synchronized  void wish(String name){
       for(int i=0;i<3;i++)
       {
           System.out.print("hello");
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){}
           System.out.println(" "+ name);
       }
    }
}

class MyThread2 extends Thread{
    MultiThreading12 m12;
    String name;

    MyThread2(MultiThreading12 m,String name){
        this.m12=m;
        this.name=name;

    }

    @Override
    public void run() {
        m12.wish(name);
    }
}

class Result{
    public static void main(String[] args) {
        MultiThreading12 m12= new MultiThreading12();
        MultiThreading12 m13= new MultiThreading12();
        MyThread2 m2= new MyThread2(m12,"Dhoni");
        m2.start();
        MyThread2 m3= new MyThread2(m13,"Yuvraj");
        m3.start();
//        System.out.println(Arrays.toString(DaysOfWeek.values()));
    }
}

enum DaysOfWeek{
    SUNDAY,MONDAY;
}