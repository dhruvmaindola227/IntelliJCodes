package com.multiThreading;

import java.util.concurrent.TimeUnit;

public class ThreadGroupConcept {

    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent(); //creating a variable of ThreadGroup type.
                                                                                  //and storing the root threadgroup(system)
                                                                                  //in it.
        Thread[] t= new Thread[system.activeCount()]; //Creating an array of Threads , with the size of number of active threads
                                                    //inside the (system)threadgroup. which is 8. only main is non daemon thread.
        system.enumerate(t); //method used to copy all active threads in an array of threads.
        for (Thread element: t){
            System.out.println(element.getName()+" "+element.isDaemon() +" "
                    +element.getThreadGroup().toString().toUpperCase());
        }

    }


}
