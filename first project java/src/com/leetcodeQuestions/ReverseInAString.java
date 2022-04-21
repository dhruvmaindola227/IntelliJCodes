package com.leetcodeQuestions;

public class ReverseInAString {
    public static void main(String[] args) {
    String s="Algoexpert is the best!";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        StringBuffer answer= new StringBuffer(s.length());
        int start=s.length()-1;
        int end=s.length();
        s=s.trim();
        for(int i= s.length()-1; i>0 ; i--)
        {
            if(i==1)
            {
                start--;
                answer.append(s.substring(start,end));
            }
            if(s.charAt(i)==' ')
            {
                answer.append(" ");
                start--;
            }

            else if(s.charAt(i-1)==' ')
            {
                answer.append(s.substring(start,end));
                start--;
                end=start;
            }
            else
            {
                start--;
            }
        }
        return answer.toString();
    }
}
