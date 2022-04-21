package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
    String s="abcbabcababucahkufnakucna";
    String p="ab";
    ArrayList<Integer> list = new ArrayList<Integer>(findAnagrams(s,p));
        System.out.println(list);
    }

    public static List<Integer> findAnagrams(String s,String p){
        char[] ch2=p.toCharArray();
        Arrays.sort(ch2);
        p=String.valueOf(ch2);
        int start=0; //cbaebabacd
        int end=start+p.length()-1;
        ArrayList<Integer> list= new ArrayList<Integer>();
        if(s.equals(p))
        {
            for(int i=0;i<s.length();i++)
            {
                list.add(i);
            }
        }
        if(p.length()>s.length())
            return list;
        for(start=0;start<s.length()-p.length()+1;start++)
        {
            if(p.contains(Character.toString(s.charAt(start)))){
                if(doesContain(s.substring(start,end+1),p))
                {   list.add(start);
                }
                end+=1;
            }
            else end++;
        }

        return list;
    }

    public static boolean doesContain(String substr, String p)
    {
        char[] ch1=substr.toCharArray();
        Arrays.sort(ch1);
        substr=String.valueOf(ch1);
        if(substr.equals(p))
        {return true;
        }
        return false;
    }
 }
