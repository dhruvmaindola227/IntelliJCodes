package com.leetcodeQuestions;

import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,1,3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
            {
                set.add(nums[i]);

            }
            else return true;
        }
        return false;
    }
}
