package com.SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,-1,35,25,-234,53};
        quickSort(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr , int start , int end){
        if(start > end){
            return;
        }
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        partition(arr , start , end , pivot);
        quickSort(arr , 0 , mid - 1);
        quickSort(arr , mid + 1, end);
    }

    public static void partition(int[] arr, int start, int end , int pivot) {
        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            /**checking like this because the check of while loop wil come after swapping() is called.
            //we need to make sure for the condition before that because it might be possible that
            //the condition has been violated already.**/
            if(start <= end){
                swap(arr , start , end);
                start++;
                end--;
            }
        }
    }

    public static void swap(int[] arr , int start , int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

}
