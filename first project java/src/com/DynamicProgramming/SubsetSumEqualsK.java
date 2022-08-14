package com.DynamicProgramming;

import java.util.Arrays;

public class SubsetSumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,5,9,11};
        int target = 3;
        System.out.println(subsetExists(arr.length ,arr , target));
    }

    public static boolean subsetExists(int size , int[] arr, int target) {
        boolean[][] dp = new boolean[size + 1][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if(i == 0){
                    dp[i][j] = false;
                }
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }
        //initializing the dp array.

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if(arr[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[size][target];

    }
}
