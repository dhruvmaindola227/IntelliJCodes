package com.leetcodeQuestions;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(Arrays.toString(countBits(number)));
    }
    public static int[] countBits(int n) {
        int[] arr  = new int[n+1];
        for(int i = 0; i <= n; i++){
            int numberOfSetBits=0;
            int num = i;
            while(num!=0){
                int rightMostBit = num & 1;
                if(rightMostBit == 1){
                    numberOfSetBits++;
                }
                num=num>>1;
            }
            arr[i] = numberOfSetBits;

        }
        return arr;
    }

}
