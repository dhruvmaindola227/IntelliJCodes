package com.SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

       int[] nums={23,29,15,19,31,7,9,5,2};
//        System.out.println("sort" + Arrays.toString(sort(nums)));
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }

    //dfs class code.
   public static int[] sort(int[] nums){
        for(int i = 1; i < nums.length ; i++){
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }

        return nums;

   }
}
