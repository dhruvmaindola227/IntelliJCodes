package com.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSubsetSumDifference {
    public static void main(String[] args) {
        int[] arr = {1,2,7};
        System.out.println(minSubsetSumDiff(arr, Arrays.stream(arr).sum()));
    }

    public static int minSubsetSumDiff(int[] arr, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
            boolean[][] dp = new boolean[arr.length + 1][sum + 1];
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
                        dp[i][j] = dp[i - 1][j - arr[i - 1]] | dp[i - 1][j];
                    else
                        dp[i][j] = dp[i - 1][j];
                }
            }

        for (int i = dp.length - 1; i < dp.length; i++) {
            for (int j = sum/2; j>=0; j--) {
                if(dp[i][j]){
                    list.add(j);
                }
            }
        }
        for(boolean[] array : dp){
            System.out.println(Arrays.toString(array));
        }
        System.out.println(list);
        int min = Integer.MAX_VALUE;
        for (Integer num : list) {
            min = Math.min(min , sum - (2 * num));
        }
        return min;

        }
    }


