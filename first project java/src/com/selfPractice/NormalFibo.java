package com.selfPractice;

import java.util.Scanner;

public class NormalFibo {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.print(a + " " +b);
        for (int i = 1; i <=num-2; i++) {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(" "+ c);
        }
    }
}
