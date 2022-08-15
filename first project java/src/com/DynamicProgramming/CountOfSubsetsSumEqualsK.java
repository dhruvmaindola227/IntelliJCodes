package com.DynamicProgramming;

public class CountOfSubsetsSumEqualsK {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,10};
        System.out.println(countOfSubsets(arr.length , arr , 10));
    }

    public static int countOfSubsets(int size , int[] arr, int target) {
        int[][] dp = new int[size + 1][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if(i == 0){
                    dp[i][j] = 0;
                }
                if(j == 0){
                    dp[i][j] = 1;
                }
            }
        }
        //initializing the dp array.

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if(arr[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[size][target];

    }
}
