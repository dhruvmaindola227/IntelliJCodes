package com.DynamicProgramming.Knapsack01;

import java.util.Arrays;

public class Knapsack01RecursivePlusMemoized {
    public static void main(String[] args) {
        int[][]dp = new int[100][100];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        System.out.println(maximizePoints( dp , 3, 7, new int[]{2, 6, 9}, new int[]{3, 5, 3}));
    }

    public static int maximizePoints(int[][] dp , int size , int maxDuration , int[] points , int[] bookDuration){
       if(maxDuration == 0 || size == 0){ //base condition -> smallest valid input.
           return 0;
       }
       if(dp[size][maxDuration] != -1){
           return dp[size][maxDuration];
       }
       if(bookDuration[size - 1] <= maxDuration){ //take max of if we take the (size-1)th book or we dont.

           return dp[size][maxDuration] =  Math.max(points[size - 1] + maximizePoints(dp,size - 1 ,
                           maxDuration - bookDuration[size - 1] ,
                   points , bookDuration) //take the (size - 1)th element

                   ,

                   maximizePoints(dp,size - 1 , maxDuration , points , bookDuration)); //skip it.

       }
           return dp[size][maxDuration] = maximizePoints(dp,size - 1 , maxDuration , points , bookDuration);
                    //if the bookDuration[i] > current maxDuration then just dont take it.
    }

}
