package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ReduceArraySizeToHalf {
    public static void main(String[] args) {
        int[] arr = {9,77,63,22,92,9,14,54,8,38,18,19,38,68,58,19};
        System.out.println(minSetSize1(arr));
    }

    public static int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //creating the frequency map.
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("map ->" + map);
        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort((a, b) -> b - a);
        System.out.println("sorted list according to values -> " + list);
        //sorting values in descending order.
        int index = 0;
        int count = 0;
        int newSize = 0;
        while (true) {
            if (newSize >= arr.length / 2) {
                return count;
            }
            newSize += list.remove(0);
            count++;
        }

    }


    public static int minSetSize1(int[] nums) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length+1; i++) {
            list.add(new ArrayList<>());
        } //adding list at each index.
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }//creating frequency map.
        for (Integer num : freq.keySet()){
            int freqOfNum = freq.get(num);
            list.get(freqOfNum).add(num);
        }
        System.out.println(freq);
        System.out.println(list);
        int count = 0;
        int i = list.size() - 1;
        int newSum = 0;

        while(i >= 0 || !(list.get(i).isEmpty())) {
            if(newSum >= nums.length / 2){
                break;
            }
            if(!(list.get(i).isEmpty())){
                list.get(i).remove(0);
                newSum += i;
                count++;
            }else{
                i--;
            }
        }
        return count;

    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }
}
