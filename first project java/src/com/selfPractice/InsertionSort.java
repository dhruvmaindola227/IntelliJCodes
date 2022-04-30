package com.selfPractice;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

       int[] nums={480,826,-13,115,-732,525,-939,-787};
        System.out.println(Arrays.toString(sort(nums)));
    }

   public static int[] sort(int[] nums){

        for(int i = 0; i < nums.length ; i++){
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
