package com.selfPractice;

import java.util.Scanner;

public class NormalFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int  fact=1;
        for(int i=num;i>0;i--) {
            fact = fact * i;
        }
        System.out.println(fact);

    }

}
