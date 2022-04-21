package com.leetcodeQuestions;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={2,5,3,4,1,0};
        System.out.println(Arrays.toString(cycle(arr)));
        Integer i=Integer.valueOf(25);
    }

    static int[] cycle(int[]nums)
    {
        int temp=0;
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i];
            if(correct<nums.length && i!=nums[i])
            {
                temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        } return nums;

    }
}
