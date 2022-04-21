package com.selfPractice;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer between 1 to 10");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
                System.out.print("*");
        }
    }
}
