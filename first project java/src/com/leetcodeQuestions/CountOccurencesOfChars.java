package com.leetcodeQuestions;

import java.util.HashMap;

public class CountOccurencesOfChars {
    public static void main(String[] args) {
        String s="aaaaabbbbbsssccc";
//        printAns(s);
        ansWithHashmap(s);
    }

    public static void printAns(String s) {
        int count=1;
        for (int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                if(i==s.length()-2){ //because we dont just want to print when the above condition is true.
                    System.out.print(s.charAt(i)+" "+ count+" ");
                }
                count++;
            }
            else{
                System.out.print(s.charAt(i)+" "+ count+" ");
                count=1;
            }
        }
    }

    public static void ansWithHashmap(String s){
        char[] chars= s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }
            else {
                map.put(chars[i],map.get(chars[i])+1);
            }
        }
        map.forEach((key,value)-> System.out.println(key+" "+ value));
    }
}
