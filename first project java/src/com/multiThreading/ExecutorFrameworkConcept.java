package com.multiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Doing this means we dont have to write each thread for each task and start them. ExecutorFramework will do that on its own.
public class ExecutorFrameworkConcept {
    public static void main(String[] args) {
        MyRunnable[] jobs= {new MyRunnable("Task 1"),
                            new MyRunnable("Task 2"),
                            new MyRunnable("Task 3"),
                            new MyRunnable("Task 4"),
                            new MyRunnable("Task 5")};
        ExecutorService service = Executors.newFixedThreadPool(2); //creating a pool of 5 threads instead of creating
                                                                           //5 individual threads for each job
        for(MyRunnable job: jobs){
            service.submit(job);
        } //threads share the work and get things done faster because each thread will do multiple jobs.
        service.shutdown(); //shutting down the working threads because if not then program will not stop.
    }
}

class MyRunnable implements Runnable{
    String name;
    MyRunnable(String name){
        this.name= name;
    }

    @Override
    public void run() {
        System.out.println(name+" started by "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){}
        System.out.println(name+" completed "+Thread.currentThread().getName());
    }
}
