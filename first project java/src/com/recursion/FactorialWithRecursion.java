package com.recursion;

public class FactorialWithRecursion{
    private static int a=1;
    public static void main(String[] args) {
        int num=4;
        System.out.println(fact(num));
    }

    static int fact(int num){
        if(num==0)
            return 1;
        return num*fact(num-1);
    }
}
