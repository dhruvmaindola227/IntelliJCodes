package com.multiThreading;

public class MultiThreading17 extends Thread{
    MultiThreading17(ThreadGroup g, String name){
        super(g,name);
    }

    @Override
    public void run() {
        System.out.println("Child thread activated");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){}
    }
}

class MainClass{
    public static void main(String[] args) {
        ThreadGroup tg1= new ThreadGroup("parent group");
        ThreadGroup tg2= new ThreadGroup(tg1,"child group");
        MultiThreading17 m17_1= new MultiThreading17(tg1,"child thread 1");
        MultiThreading17 m17_2= new MultiThreading17(tg1,"child thread 2");
        m17_1.start();
        m17_2.start();
        System.out.println("printing the activeCount of parent thread "+tg1.activeCount());
        System.out.println("printing the activeGroupCount of child thread "+tg1.activeGroupCount());
        System.out.println("printing the activeCount of chuld thread "+tg2.activeCount());
        System.out.println("printing the activeGroupCount of child thread "+tg2.activeGroupCount());
        System.out.println("now printing the .list() on tg1");
        tg1.list();
        System.out.println("now printing the .list() on tg2");
        tg2.list();
    }
}
