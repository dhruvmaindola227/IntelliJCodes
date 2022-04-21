package javaAssignmentMCA;

import java.util.ArrayList;

//Write a java program to find longest substring without repeating characters in the given string.
public class Q43 {
    public static void main(String[] args) {
        String s1="aabb";
        System.out.println(longestSubstr(s1));
    }

    public static String longestSubstr(String s1) {
        int flag=1;
        ArrayList<Character> ch= new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {   flag=1;
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    if(!ch.isEmpty()) {
                        ch.clear();
                    }
                    flag = 0;
                    break;
                }
            }
            if(flag==1)
                ch.add(s1.charAt(i));
        }
        StringBuffer ans= new StringBuffer();
        for(int i=0;i<ch.size();i++){
            ans.append(ch.get(i));
        }
        return ans.toString();
    }
}
