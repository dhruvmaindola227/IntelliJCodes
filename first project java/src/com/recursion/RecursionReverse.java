package com.recursion;

public class RecursionReverse {
    public static void main(String[] args) {
//        fun(1234);
        printnum(10);
    }

//   static int rev=0;
//    static void fun(int num)
//    {
//        if(num==0)
//        {
//            System.out.println(rev);
//        }
//        else {
//            int digit = num % 10;
//            rev = (rev * 10) + digit;
//            num = num / 10;
//            fun(num);
//        }

    static void printnum(int num)
    {   if(num<1)
        {}
        else {
        System.out.println(num);
        printnum(--num);
    }

    }

    }

