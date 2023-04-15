package com.leetcodeQuestions;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String str = "bbab";
        System.out.println(longestPalindromicSubequence(str));
    }

    public static int longestPalindromicSubequence(String str) {
        return helper(0 , str.length() - 1, str);
    }
    // this will give time limit exceeded in leetcode.
    // Time Complexity - O(2^n)
    public static int helper(int left, int right, String s) {
        if (left == right)
            return 1;
        if (left > right)
            return 0; // happens after "aa"
        return s.charAt(left) == s.charAt(right) ? 2 + helper(left + 1, right - 1, s)
                : Math.max(helper(left + 1, right, s),
                helper(left, right - 1, s));
    }
}
