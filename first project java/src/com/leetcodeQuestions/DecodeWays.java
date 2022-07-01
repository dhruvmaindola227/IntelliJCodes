package com.leetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
    public static void main(String[] args) {
        String numbers = "11111111111111";
        System.out.println(numbers.length());
        System.out.println(numDecodings(numbers));
    }
    public static int numDecodings(String s) {
        HashMap<String , Integer> map = new HashMap<>();
        if(s.length() == 0 || s == null){
            return 0;
        }//edge case
        int result = dfs(s , map);
        return result;
    }

    public static int dfs(String s , HashMap<String , Integer> map){
        if(map.containsKey(s)){ //caching previous answers.
            return map.get(s);
        }
        if(s.length() > 0){
            if(s.charAt(0) == '0')
                return 0;
        }//edge case 2
        if(s.isEmpty() || s.length() == 1){ //base condition
            return 1;
        }
        if(Integer.parseInt(s.substring(0,2)) <= 26){
            int first = dfs(s.substring(1) , map);
            map.put(s.substring(1) , first);
            System.out.println("after first call " + map);
            int second = dfs(s.substring(2) , map);
            map.put(s.substring(2) , second);
            System.out.println("after second call " + map);
            return first + second;
        }
        else{
            return dfs(s.substring(1) , map);
        }
    }
}
