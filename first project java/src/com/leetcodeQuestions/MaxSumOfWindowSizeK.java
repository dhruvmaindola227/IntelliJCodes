package com.leetcodeQuestions;

import java.util.Arrays;

public class MaxSumOfWindowSizeK {
    public static void main(String[] args) {
        System.out.println(slidingWindowMaxOfSizeK(new int[]{200, 2, 3, 4, 1, 100}, 3));
    }

    public static int slidingWindowMaxOfSizeK(int[] arr , int k ) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            currSum = 0;
            for (int j = i; j < i + k; j++) {
                currSum += arr[j];
            }
            max = Math.max(currSum , max);
        }

    return max;
    }
}
