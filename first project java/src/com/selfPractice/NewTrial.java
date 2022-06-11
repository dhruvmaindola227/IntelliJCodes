package com.selfPractice;

import static com.selfPractice.NewTrial.abc;

public class NewTrial {
    static int a = 10;
    public static void main(String[] args) {
       abc();
        System.out.println(a);
    }
    static void abc(){
        a = 20;
        System.out.println(a);
    }
}
