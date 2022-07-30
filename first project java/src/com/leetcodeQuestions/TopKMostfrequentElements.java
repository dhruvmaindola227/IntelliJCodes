package com.leetcodeQuestions;

import java.util.*;

public class TopKMostfrequentElements {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKMostFrequent(arr, k)));
        System.out.println(Arrays.toString(topKFrequentElements(arr , k)));
    }
    public static int[] topKFrequentElements(int[] nums, int k) {
        // build map<num, frequence>
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums) map.put(num, map.getOrDefault(num, 0) + 1);

        // sort list from map.keyset() by map.get(num),
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a)); //to sort list of keys in decreasing order of their values in map.

        // transfer results from list to int[];
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = list.get(i);

        return res;
    }
    public static int[] topKMostFrequent(int[] nums, int k) {
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
        HashMap<Integer , Integer> freq = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length+1; i++) {
            list.add(new ArrayList<>());
        }
        int[] answer = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i] , 1);
            }else{
                freq.put(nums[i] , freq.get(nums[i]) +1);
            }
        }
        for (Integer num : freq.keySet()){
            int freqOfNum = freq.get(num);
            list.get(freqOfNum).add(num);
        }
        System.out.println(list);
        int i = list.size()-1;
        int index = 0;
        while(i >= 0 && index < k){
            if (!list.get(i).isEmpty()) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    answer[index] = list.get(i).get(j);
                    index++;
                }
            }
            i--;
        }
        return answer;
    }


}
