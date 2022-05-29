package com.selfPractice;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {32,34,82,0,23,7,453};
        System.out.println("answer array " + Arrays.toString(radixSort(arr)));

    }
    public static int[] radixSort(int[] arr) {
        int numberOfDigitsInMax = 0;
        int sum = 0;
        int currentDigit=0;
        int[] outputArr = new int[arr.length];
        int[] freqArr = new int[10], sumArr = new int[10];
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        while(max != 0){
            numberOfDigitsInMax++;
            max/=10;
        }

        for (int i = 0; i < numberOfDigitsInMax; i++) {
            sum = 0;
            Arrays.fill(sumArr , 0);
            Arrays.fill(freqArr , 0);
            Arrays.fill(outputArr, 0);
            for(int j = 0 ; j < arr.length ; j++){
                currentDigit =(int) (arr[j] / Math.pow( 10, i)) % 10;
                System.out.println("Number is "+ arr[j] + " for i = " + i + " num is "+currentDigit);
                freqArr[currentDigit]+=1;
            }
            System.out.println("freq "+Arrays.toString(freqArr));

            for (int j = 0; j < freqArr.length; j++) {
                sum += freqArr[j];
                sumArr[j] = sum;
            }
            System.out.println("sum "+Arrays.toString(sumArr));

            for (int j = arr.length-1; j >= 0; j--) {
                currentDigit =(int) (arr[j] / Math.pow( 10, i)) % 10;
                sumArr[currentDigit]--;
                outputArr[sumArr[currentDigit]] = arr[j];
            }
            arr= Arrays.copyOf(outputArr , outputArr.length);

        }
        return arr;
    }

    }

