package com.LambdaExpressions;

public class MultiThreadingExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("run method is running"));
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("AIC method is running");
            }
        });
        t.start();
        t1.start();

        //this lambda behaves exactly like an object of a class which has overridden the run() method.
        //or even like an AIC.
        //this is why nobody needed to go back and change things in the Thread class because lambdas behave like that.
        //so Thread class has no idea.
    }
}
