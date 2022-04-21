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
            //storing in the hashmap like
            //{
            //  1 -> [5]
            //  3 -> [0,1,2,3,4,6]
            // }
        }

        for(int key: map.keySet()){
            int i=0;
            ArrayList<Integer> res = map.get(key);
            while(i+key<=res.size()){
                ansArr.add(res.subList(i,i+key)); //traversing the loop key number of times and storing a sublist
                                                  //in a new 2d list each of size key. found sublist on youtube
                                                  // was becoming too complicated to do on my own
                i+=key;
            }
        }
        return ansArr;

    }
}
