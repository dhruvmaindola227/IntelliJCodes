package com.leetcodeQuestions;

public class SumOfAllOddArrays {
    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[] {1,2,3,4,5}));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int windowSize = 1;
        int currentMax = 0;
        int finalSum = 0;

            for (windowSize = 1; windowSize <= arr.length ; windowSize+=2) {
                currentMax = slidingWindowMaxOfSizeK(arr , windowSize);
                finalSum += currentMax;
            }

        return finalSum;
    }
    public static int slidingWindowMaxOfSizeK(int[] arr , int k ) {
        int currSum = 0;
        int absSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            currSum = 0;
            for (int j = i; j < i + k; j++) {
                currSum += arr[j];
            }
            absSum += currSum;
        }
        return absSum;
    }
}
