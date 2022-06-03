package com.selfPractice;

public class MinCharToToRemoveToMakePalindrome {
    public static void main(String[] args) {
        String s = "acdbdba";
        System.out.println(minCharToRemove(s));
    }

    public static int minCharToRemove(String s) {
        //helper function will return us the largest palindromic subsequence.
        //length - lps is the min deletions to make.
//        return s.length() - helper(s);

        return s.length() - helper2(s , 0 , s.length()-1);
    }

//this is basically passing the substring b/w 2 pointers instead of the two pointers themselves.
    private static int helper(String s) {
            if (s.length() == 1) {
                return 1;
            }
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return helper(s.substring(1,s.length() - 1)) + 2;
            } else {
                return Math.max(helper(s.substring(1)), helper(s.substring(0,s.length() - 1)));
            }
    }
    //this is using two pointers
    private static int helper2(String s , int i , int j ){
        if(i == j){
            return 1;
        }
        if(s.charAt(i) == s.charAt(j)){
            return 2 + helper2(s , i+1 , j-1);
        }else{
            return Math.max(helper2(s,i,j-1) , helper2(s,i+1,j));
        }

    }
}

