package com.selfPractice;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr= {1,0,1,2,2};
        System.out.println(Arrays.toString(countSort(arr)));
    }

    public static int[] countSort(int[] arr) {
        int max=0;
        int sum=0;
        int[] outputArr = new int[arr.length];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        int[] freqArr = new int[max+1];
        int[] sumArr = new int[freqArr.length];
        for(int i=0;i<arr.length;i++){
            freqArr[arr[i]]++;
        }

        for(int i = 0 ; i < freqArr.length ; i++){
            sum+= freqArr[i];
            sumArr[i] = sum;
        }

        for(int i=0;i<arr.length;i++){
            sumArr[arr[i]]--;
            outputArr[sumArr[arr[i]]]=arr[i];
        }

        return outputArr;
    }
}
