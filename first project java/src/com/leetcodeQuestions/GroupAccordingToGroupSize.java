package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAccordingToGroupSize {
    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
        System.out.println(groupThePeople(groupSizes));
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<List<Integer>> ansArr= new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i],new ArrayList<>());
                map.get(groupSizes[i]).add(i);
            }
            else {
                map.get(groupSizes[i]).add(i);
            }
        }
//        System.out.println(map);
        for(int key: map.keySet()){
            int i=0;
            ArrayList<Integer> res = map.get(key);
            while(i+key<=res.size()){
                ansArr.add(res.subList(i,i+key));
                i+=key;
            }
        }
        return ansArr;

    }
}
