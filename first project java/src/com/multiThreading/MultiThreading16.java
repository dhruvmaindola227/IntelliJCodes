package com.multiThreading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiThreading16  {
    public static void main(String[] args) {
     Multi m= new Multi();
        m.setDaemon(true); //makes this to be daemon so once main terminates this will also terminate whether it is done
        //executing or not.
        m.start();
        System.out.println("main thread");

    }

}

class Multi extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException ie){}
        }
    }
}
