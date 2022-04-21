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

//    public static boolean wordBreak(String s, List<String> wordDict) {
//        int end=0;
//        StringBuilder tempWord=new StringBuilder();
//        //adding the elements of the list to a hashset for the betterment of time complexity.
//        HashMap<String,Integer> map = new HashMap<>();
//        for(int i=0;i<wordDict.size();i++){
//            map.put(wordDict.get(i),i);
//        }
//        //aaaaaaa   //aaaa aaa
//        while(end<s.length()){
//            tempWord.append(s.charAt(end));
//            if(end==s.length()-1) {
//                if (map.containsKey(tempWord.toString()))
//                    return true;
//                else end++;
//            }
//            else {
//                if(map.containsKey(tempWord.toString())) {
//                    tempWord.setLength(0);
//                    end++;
//                } else {
//                    end++;
//                }
//            }
//            }
//        return false;
//    }

