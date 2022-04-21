package javaAssignmentMCA;

import java.util.Arrays;

//Write a java program to check whether two strings are anagram or not?
public class Q37 {
    public static void main(String[] args) {
        String s1="abdsde";
        String s2="bcdae";
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1,String s2)
    {
        if(s2.length()<s1.length())
            return false;
        else{
            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            s1=String.valueOf(ch1);
            s2=String.valueOf(ch2);
            return s1.equals(s2);
        }
    }
}
