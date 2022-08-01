package com.SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {23,29,15,19,31,7,9,5,2};
        System.out.println("shell sort -> " + Arrays.toString(shellSort(arr)));
    }

    public static int[] shellSort(int[] arr) {
        int gap = arr.length / 2;
        while(gap != 1) {
            int i = 0;
            int j = i + gap;
            while (i < arr.length - gap) {
                int left_gap = i;
                if (left_gap >= gap) {
                    if (arr[i - gap] > arr[i]) {
                        swap(arr, i - gap, i);
                    }
                }
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
                i++;
                j++;
            }
            gap /= 2;
        }
        System.out.println(Arrays.toString(arr));
         InsertionSort.insertionSort(arr);
        return arr;
    }

    public static void swap(int[] arr , int start , int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}
