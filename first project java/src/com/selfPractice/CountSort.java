package com.selfPractice;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr= {3,7,23,6,2,5};
//        System.out.println(Arrays.toString(countSort(arr)));
        countSort2(arr);
        System.out.println(Arrays.toString(arr));
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

    public static void countSort2(int[] arr){
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
        int j = 0;
        int i = 0;
        while(j  < freqArr.length){
            if(freqArr[j] > 0){
                arr[i] = j;
                freqArr[j]--;
                i++;
            }else{
                j++;
            }
        }

    }
}
