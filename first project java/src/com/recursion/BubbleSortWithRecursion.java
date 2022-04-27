package com.recursion;

import java.util.Arrays;

public class BubbleSortWithRecursion {
    static int i = 0;
    static int j = 1;
    public static void main(String[] args) {
        int[] arr={43,51,1,10,-23,432,4234};
        recursiveBubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void recursiveBubbleSort(int[] arr , int row , int col) {
        if(row == 0) return;

        if(col < row) {
            if (arr[col] > arr[col + 1]) {
                //swap the elements
                int temp = arr[col + 1];
                arr[col + 1] = arr[col];
                arr[col] = temp;
            }
            recursiveBubbleSort(arr, row, col + 1);
        } else{
                recursiveBubbleSort(arr,row-1,0);
            }
        }
    }

