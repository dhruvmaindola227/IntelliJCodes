package com.leetcodeQuestions;

import java.util.Arrays;
//understood from neetcode.
//bottom up approach.
public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {6,4};
        int amount = 20;
        System.out.println(coinChange(arr,amount));
    }
    public static int coinChange(int[] coins, int amount) {
                int[] dp = new int[amount + 1];
                Arrays.fill(dp , 1 , dp.length , amount + 1); //initializing array with max value ie. amount+1.
                for (int i=1; i < dp.length; i++) { //calculating no.of.coins for all amounts till the actual amount.
                    for (int coin : coins) {
                        if (i >= coin) {
                            dp[i] = Math.min(dp[i], dp[i - coin] + 1); //finding the minimum number of coins to make up the amount.
                        }
                    }
                }
                return dp[amount] == dp.length ? -1 : dp[amount]; //if the dp[amount] is still the max value then it wasnt calculated.
            }
}
