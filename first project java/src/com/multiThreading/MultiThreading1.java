package com.multiThreading;

public class MultiThreading1 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            System.out.println("Namaste");
        }
        Trial t = new Trial();
            t.start();


    }
}
    class Trial extends Thread{

        @Override
        public void run() {
            for(int i=0;i<10;i++)
            {
                System.out.println("Hello");
            }
        }
    }

