package com.multiThreading;

public class MultiThreading14 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadB mb= new MyThreadB();
        mb.start();
        synchronized (mb) {
//        mb.join(); //basically this means main thread is saying here that it will wait till the complete execution of the
            //Thread-0.
// not recommended because if the run() method has a lot of code after the for loop then main thread
            //will have to wait till Thread-0 is completely done with it.
            mb.wait(); //main thread is executing this line that means that main thread has released the lock of mb and main is in
            //in waiting stage until the Thread-0 notifies that it is done updating the total variable.
            System.out.println("main thread notification received");
            System.out.println(mb.total);
        }
    }
}

class MyThreadB extends Thread{
    int total=0;
    @Override
    public void run() {
        synchronized (this) { //only in synchronized block , wait() , notify() can be used. Otherwise IllegalMonitorStateException
            System.out.println("child thread starting to calculate");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("child thread notifying.");
            this.notify();
        }

    }
}