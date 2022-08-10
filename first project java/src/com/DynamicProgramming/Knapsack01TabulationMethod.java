package com.DynamicProgramming;

import java.util.Arrays;

public class Knapsack01TabulationMethod {
    public static void main(String[] args) {
        int[] weight = {2, 6, 9};
        int[] price = {3, 5, 3};
        System.out.println(maxPrice(weight , price , 7 , 3));
    }

    public static int maxPrice(int[] weight, int[] price, int capacity, int size) {

        int[][] dp = new int[size + 1][capacity + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if(weight[i - 1] <= j){
                    dp[i][j] = Math.max(price[i - 1] + dp[i - 1][j - weight[i - 1]]
                                ,
                                dp[i - 1][j]);
                }else{
                    dp[i][j] = dp[i- 1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[size][capacity];

    }
}
