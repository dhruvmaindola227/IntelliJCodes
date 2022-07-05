package com.leetcodeQuestions;

import java.util.Arrays;

public class BuySellStockLeetcode {
    public static void main(String[] args) {
        int[] arr={7,8,2,6};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = 0;

        for(int i = 0 ; i < prices.length ; i++){
            buyPrice = Math.min(buyPrice , prices[i]); //find min possible buyPrice
            sellPrice = Math.max(sellPrice , prices[i] - buyPrice); //calculate max possible sellPrice
        }
        return sellPrice;
    }
}
