package com.leetcodeQuestions;

public class CountOccurencesOfChars {
    public static void main(String[] args) {
        String s="aaaaabbbbbsssccc";
        printAns(s);
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
}
