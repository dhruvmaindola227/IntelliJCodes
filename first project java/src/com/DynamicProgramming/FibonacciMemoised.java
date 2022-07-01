package com.DynamicProgramming;

import java.util.Arrays;

public class FibonacciMemoised {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(fibo(number));
    }
    //Time complexity -> O(N)
    //Space Complexity -> O(N)
    public static int fibo(int number) {
        int[] dp = new int[number + 1];
        Arrays.fill(dp , -1);
        return helper(number , dp);
    }

    public static int helper(int number, int[] dp) {
        if (number < 2) {
            return number;
        } //base condition
        if(dp[number] != -1){
            return dp[number];
        }
        dp[number] = fibo(number - 1) + fibo(number - 2);
        return dp[number];
    }
}
