package com.leetcodeQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] array={10,3,1,34};
        System.out.println(Arrays.toString(twoSum(array,35)));
        String s= "abc";
        StringBuilder sb= new StringBuilder(s);
        sb.append("d");
        System.out.println(sb.insert(0,'g'));


    }

static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]),i};
            else map.put(nums[i], i);
        }
        return null;
    }
}
