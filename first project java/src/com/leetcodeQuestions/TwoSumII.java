package com.leetcodeQuestions;

import java.util.Arrays;
//Array is already sorted and then passed to the function.
public class TwoSumII {
    public static void main(String[] args) {
        int[] arr={-10,-6,-2,-1,0,2,4,6,10};
        int target = 4;
        System.out.println(Arrays.toString(twoSumII(arr, target)));
    }

    public static int[] twoSumII(int[] arr , int target){
        int left=0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                return new int[]{left,right};
            }
            else if(arr[left]+arr[right]>target) {
                right--;
            }
            else left++;
        }
        return null;
    }
}
