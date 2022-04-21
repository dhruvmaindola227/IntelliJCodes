package javaAssignmentMCA;

import java.util.Arrays;

//Write a java program to check whether one string is a rotation of another?
public class Q36 {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="dabc";
        if(checkRotation(s1,s2))
            System.out.println("They are rotation of each other!");
        else System.out.println("They are not rotation of each other!");
    }

    public static boolean checkRotation(String s1,String s2)
    {   int length1=s1.length();
        int length2=s2.length();
        for(int i=0;i<length2;i++)
        {
            s2=reverse(s2,0,i);
            s2=reverse(s2,i+1,length2-1);
            s2=reverse(s2,0,length2-1);
            if(s1.equals(s2))
                return true;
        }
        return false;
    }
    public static String reverse(String s,int start,int end)
    {
        char[] ch= s.toCharArray();
        while(start<end)
        {
            char temp=ch[end];
            ch[end]=ch[start];
            ch[start]=temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
}
