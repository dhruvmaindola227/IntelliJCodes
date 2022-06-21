package com.leetcodeQuestions;

import java.util.*;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "aa";
        String p = "bb";
        ArrayList<Integer> list = new ArrayList<>(findAnagrams(s, p));
        System.out.println(list);
//        Map<Character , Integer> pCount = new HashMap<>();
//        Map<Character , Integer> sCount = new HashMap<>();
//        pCount.put('a' , 2);
//        sCount.put('b' , 2);
//        System.out.println(pCount.equals(sCount));
    }


    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> answer = new ArrayList<>();
        if(s.length() < p.length()){ //base condition.
            return new ArrayList<>();
        }

        Map<Character , Integer> pCount = new HashMap<>();
        Map<Character , Integer> sCount = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pCount.put(p.charAt(i) , pCount.getOrDefault(p.charAt(i) , 0) + 1);
            sCount.put(s.charAt(i) , sCount.getOrDefault(s.charAt(i) , 0) + 1);
        }
        if(sCount.equals(pCount)) {
            answer.add(0);
        }
        int left = 0;
        for (int right = p.length() ; right < s.length() ; right++){
            sCount.put(s.charAt(right) , sCount.getOrDefault(s.charAt(right) , 0) + 1);
            sCount.put(s.charAt(left) , sCount.getOrDefault(s.charAt(left) , 0) - 1);

            if(sCount.get(s.charAt(left)) == 0){
                sCount.remove(s.charAt(left));
            }
            left++;
            if(sCount.equals(pCount)){
                answer.add(left);
            }
        }

        return answer;
    }
}
