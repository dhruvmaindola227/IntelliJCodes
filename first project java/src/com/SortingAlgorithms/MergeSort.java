package com.SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,-1,35,25,-234,53};
        arr= mergeSort(arr);
        System.out.println("merge sort -> "+ Arrays.toString(arr));

    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        int mid= arr.length / 2;
        int[] left =  mergeSort(Arrays.copyOfRange(arr,0 , mid)); //copyOfRange end value is excluding.
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left , right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k] = left[i];
                i++;
            }else{
                result[k] = right[j];
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

//    private static int[] merge(int[] first, int[] second) {
//        int[] mix = new int[first.length + second.length];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < first.length && j < second.length) {
//            if (first[i] < second[j]) {
//                mix[k] = first[i];
//                i++;
//            } else {
//                mix[k] = second[j];
//                j++;
//            }
//            k++;
//        }
//
//        // it may be possible that one of the arrays is not complete
//        // copy the remaining elements
//        while (i < first.length) {
//            mix[k] = first[i];
//            i++;
//            k++;
//        }
//
//        while (j < second.length) {
//            mix[k] = second[j];
//            j++;
//            k++;
//        }
//
//        return mix;
//    }
}
