package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        Map<Character , Integer> map = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }//make the frequency map.
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((o1,o2) -> map.get(o2) - map.get(o1));
        for(char ch : list){
            for (int i = 0; i < map.get(ch); i++) {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
