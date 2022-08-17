package com.DynamicProgramming.Knapsack01;

import java.util.Arrays;

public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = {1,5,11,5};
        System.out.println(equalSumPartitionPossible(arr));
    }

    public static boolean equalSumPartitionPossible(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        if(sum % 2 != 0){
            return false;
        }
        return SubsetSumEqualsK.subsetExists(arr.length , arr , sum / 2);

    }
}
