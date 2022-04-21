package com.leetcodeQuestions;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        System.out.println(answer("abcabcaa"));
    }
    public static int answer(String s) {
        int start = 0;
        int end = 0;
        if (s.length() == 0)
            return 0; //handling the edge case with an empty string.
        StringBuilder ans = new StringBuilder(Character.toString(s.charAt(start))); //initialising the string builder with the
                                                                                    //first character of the given string.
        int max_length = 1;
        while (end < s.length() - 1) {
            if (ans.indexOf(Character.toString(s.charAt(end + 1))) == -1){ //check if the next character doesn't exist in the
                                                                           //current ans.
                ans.append(s.charAt(end+1)); //append that character
                max_length=Math.max(ans.length(),max_length); //compare ans new length with previous maxlength value
                end++; //increase the pointer to the right.
            }
            else{
                ans.setLength(0);  //if it exists then set the string builder as empty
                start++; //bring the start pointer to the next index
                ans.append(Character.toString(s.charAt(start))); //append the start pointer character
                end=start; //bring the end to start point and then repeat the process.
            }
        }
        return max_length;
        }
    }
