package com.leetcodeQuestions;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int arr[]= {186,419,83,408};
        int amount = 6249;
        System.out.println(coinChange(arr,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int coinsCount=0;
        int end = coins.length-1;
        int divident = 0;
        int remainder = 0;
        while(end >-1){
            divident = amount / coins[end];
            coinsCount+=divident;
            remainder = amount % coins[end];
            if(remainder!=0){
                amount = remainder;
                end--;
            }else if(remainder==0){
                return coinsCount;
            }
        }//end of while loop

        return -1; //returning -1 if no combination found.
    }
}
