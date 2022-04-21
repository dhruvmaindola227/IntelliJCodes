package com.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockConcept {
    public static void main(String[] args) {
    Display display= new Display();
        MT mt = new MT(display,"Dhoni");
        MT mt2= new MT(display,"yubraj");
        mt.start();
        mt2.start();
    }
}

class DisplayName{
    ReentrantLock rl= new ReentrantLock();
    public void wishName(String name){
        rl.lock(); //using this lock and unlock method works same as making wishName() synchronized.
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){}
            System.out.print(name);
        }
        rl.unlock();
    }
}

class MT extends Thread{
    Display display;
    String name;
    MT(Display display, String name){
        this.display= display;
        this.name= name;
    }

    @Override
    public void run() {
        display.wishName(name);
    }
}