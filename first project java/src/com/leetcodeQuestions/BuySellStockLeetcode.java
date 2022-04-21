package com.leetcodeQuestions;

import java.util.Arrays;

public class BuySellStockLeetcode {
    public static void main(String[] args) {
        int[] arr={7,8,2,6};
        System.out.println(answer(arr));
    }

    static int answer(int[] prices){
        int max=Integer.MIN_VALUE;
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>max)
                max=prices[i];
        }
        for(int i=0;i<prices.length;i++)
        {
            prices[i]=max-prices[i];
        }

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>max)
                max=prices[i];
            if(prices[i]!=0 && prices[i]<min)
                min=prices[i];
        }
        return max-min;
    }
}
