package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TopKMostfrequentElements {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        ArrayList<Integer> arr= new ArrayList<>(map.values());
        Arrays.sort(arr.toArray());
     return new int[]{};
    }
}
