package com.recursion;

public class FiboWithRecursion {
    private static int b=1;
    private static int a=-1;
    public static void main(String[] args) {
        int num=5;
        fibo(num);

    }

    static  void fibo(int num) {
        if(num>1)
            fibo(num-1);
        int c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
    }
    }

