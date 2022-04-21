package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
//Find the longest palindromic substring - Leetcode.
public class LongestPalindromicString {
    public static void main(String[] args) {
        String s="racecarnnnnn";
        //fsdfdabbbbbbabbde
        //dfd //abbbbbba //bbabb //bab //bb //bbbbbb
        System.out.println(longestPalindrome(s));
        }


    static String longestPalindrome(String s){
        ArrayList<Integer> lr=new ArrayList<>();
        int start=0;
        int end=s.length();
        int max_length=1;
        StringBuilder ans= new StringBuilder("");
        while(start<end)
        {   String str=s.substring(start,end);
            if(s.charAt(start)!=s.charAt(end-1)) {
                if(end==start+1)
                {
                    end=s.length()-1;
                    start++;
                }
                else
                end--;
            }
            else {
                    boolean res=checkPal(str);
                if (res) {
                    if (str.length() > max_length) {
                        max_length = str.length();
                        ans.setLength(0);
                        ans.append(s.substring(start, end));

                    } else {
                        start++;
                        end = s.length() - 1;
                    }
                } else
                    end--;
            }
        }
        return ans.toString();
    }

    static boolean checkPal(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)==(str.charAt(end))) {
                start++;
                end--;
            }
            else return false;
        }
        return true;
    }
    }

