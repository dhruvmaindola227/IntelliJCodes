package com.multiThreading;

public class MultiThreading13 {
    public static void main(String[] args) {
        Display display= new Display();
        MyThread13 t1 = new MyThread13(display,"Dhoni");
        MyThread13 t2= new MyThread13(display,"Yuvraj");
        t1.start();
        t2.start();
    }
}

class Display{
    public void wishName(String name){
    synchronized(this) { //since this is a synchronized so the object that comes here first will get the lock and do whatever it
                         //wants to do. then only another object which is also is coming here will be able to work on it.
                         //And doing that is better than making wishName() synchronized as whole.
        /**some 10k lines of code.*/
        for (int i = 0; i < 5; i++) {
            System.out.print("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {}
            System.out.println(" "+ name);
        }
        /**Another 10k lines of code.*/
    }
    }
}

class MyThread13 extends Thread{
    Display d;
    String name;
    MyThread13(Display d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wishName(name);
    }
}
