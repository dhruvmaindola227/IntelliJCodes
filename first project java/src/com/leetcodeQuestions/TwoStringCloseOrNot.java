package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoStringCloseOrNot {
    public static void main(String[] args) {
        System.out.println(closeStrings("abc" , "bca"));
    }

    public static boolean closeStrings(String word1, String word2) {
        ArrayList<Character> chars = new ArrayList(Collections.singleton(word1));
        Collections.sort(chars);
        System.out.println(chars);
        ArrayList<Character> char2 = new ArrayList(Collections.singleton(word2));
        Collections.sort(char2);
        System.out.println(char2);
        return chars.equals(char2);
    }
}
