package com.DynamicProgramming.Fibonacci;

public class FibonacciTabulated {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(fibo(number));
    }

    public static int fibo(int number) {
        int[] dp = new int[number + 1];
        dp[0] = 0; //these are the two solutions we already know.
        dp[1] = 1; //so they are the base conditions.
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[number];
    }
}
