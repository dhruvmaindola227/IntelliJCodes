package com.leetcodeQuestions;

import java.util.*;

public class LetterCombinationOfPhone {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

        public static List<String> letterCombinations(String digits) {
            ArrayList<String> ans = new ArrayList<>();
            if(digits.length() == 0){
                return new ArrayList<>();
            }
            HashMap<Character , String> map = new HashMap<>();
            map.put('2',"abc");
            map.put('3',"def");
            map.put('4',"ghi");
            map.put('5',"jkl");
            map.put('6',"mno");
            map.put('7',"pqrs");
            map.put('8',"tuv");
            map.put('9',"wxyz");
            ans = helper("" , digits , map);
            return ans;
        }

        public static ArrayList<String> helper(String p , String up , HashMap<Character , String> charMap){
            ArrayList<String> ans = new ArrayList<>();
            ArrayList<String> temp = new ArrayList<>();
            //base condition
            if(up == ""){
                ans.add(p);
                return ans;
            }
            //using backtracking (processed and unprocessed approach).
            char firstDigit = up.charAt(0);
            String alphabets = charMap.get(firstDigit);
            for(int i = 0 ; i < alphabets.length() ; i++){
                temp =  helper(p + alphabets.charAt(i) , up.substring(1) , charMap);
                ans.addAll(temp);
            }
            return ans;
        }
    }

