package com.SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,1,-3,35,2,2,2,2,2};
        arr= mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left =  mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left,right);

    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[i]){
                result[k] = left[j];
                i++;
            }else{
                result[k] = right[i];
                j++;
            }
            k++;
        }
        while (i < left.length){
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
}
