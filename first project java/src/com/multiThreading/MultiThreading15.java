package com.multiThreading;
//creating a deadlock situation.
public class MultiThreading15 extends Thread{
    A a= new A();
    B b=new B();
    public static void main(String[] args) {
    MultiThreading15 m15= new MultiThreading15();
    m15.start();
    }
     void m1(){
        b.d1(a);
    }
    @Override
    public void run() {
        a.d1(b);
    }
}

class A{
    synchronized public void d1(B b){
        System.out.println("thread 1 starts execution");
        b.last();
    }

    synchronized public void last(){
        System.out.println("In last of A");
    }
}

class B{
    synchronized public void d1(A a){
        System.out.println("thread 2 starts execution");
        a.last();
    }
    synchronized void last(){
        System.out.println("In last of B");
    }
}
