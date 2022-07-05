package com.leetcodeQuestions;

import java.util.*;

public class WordBreak {
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        String s="catsandog";
        List<String> wordDict= new ArrayList<>(List.of("cats","dog","sand","and","cat"));
        HashSet<String> set= new HashSet<>();
        for(String element:wordDict){ //adding the elements of the list to a hashset for the betterment of time complexity.
            set.add(element);
        }
        System.out.println(wordBreak(s,set));
    }
    public static boolean wordBreak(String s, Set<String> wordDict) {
        if(s.length() == 0) return true;
        if(wordDict.contains(s)) return true;
        for(int i = 1; i < s.length(); i++){
            if(wordDict.contains(s.substring(0,i)) && !set.contains(i)){
                if(wordBreak(s.substring(i),wordDict))
                    return true;
                else set.add(i);
            }
        }
        return false;
    }
}



