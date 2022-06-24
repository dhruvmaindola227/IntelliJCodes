package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        String[] strs = {"leet" , "code","dhruv","sdasd"};
        List<String> str = new ArrayList<>(Arrays.asList(strs));
        System.out.println(encode(str));
        System.out.println(decode(encode(str)));
    }

    public static String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for (String string : strs){
            ans.append(string.length()).append("#").append(string);
        }
        return ans.toString();
    }

    public static List<String> decode(String str) {
        String[] ans = str.split("[1-9]#");
        List<String> res = new ArrayList<>(Arrays.asList(ans).subList(1, ans.length));
        return res;
    }

}
