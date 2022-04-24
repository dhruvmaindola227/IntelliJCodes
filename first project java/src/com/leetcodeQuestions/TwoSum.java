package com.leetcodeQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] array={3,2,4,7,3,5,8,2,5,8,3,1};
        //[-1,0,1,2,3,4] target=0

//        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(twoSum3(array,16)));
    }


        static int[] twoSum3(int[] nums , int target){ //brute force approach
        //O(N^2) with space complexity as O(1)
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
        }

static int[] twoSum1(int[] nums, int target) { //optimal ideal approach. O(n) with space complexity as O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]),i};
            else map.put(nums[i], i);
        }
        return null;
    }
}
