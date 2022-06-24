package com.leetcodeQuestions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        System.out.println("product is -> " + Arrays.toString(productExceptSelf(nums)));
        System.out.println("product is -> " + Arrays.toString(productOfArrayExceptSelf(nums)));
    }
    //O(N^2) time and space complexity.
    //will give TLE in leetcode.
    public static int[] productOfArrayExceptSelf(int[] nums){
        int product = 1;
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            product = 1;
            for (int j = 0; j < n; j++) {
                if(i != j)
                    product *= nums[j];
            }
            result[i] = product;
        }
        return result;
    }
    //O(N) time complexity. O(1) space (because at leetcode it states output array wont count as extra space.)
    public static int[] productExceptSelf(int[] arr){
        int[] result = new int[arr.length];
        //creating the left to right product.
        for (int i = 0 , temp = 1; i < arr.length ; i++){
            result[i] = temp;
            temp *= arr[i];
        }

        //creating the right to left product.
        for (int i = arr.length - 1 , temp = 1; i >= 0 ; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;
    }
}
