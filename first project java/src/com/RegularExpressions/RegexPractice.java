package com.RegularExpressions;

public class RegexPractice {
    public static void main(String[] args) {
        String s1="xyz abc xyz abc abc abc abc sattu";
        String regex="(?i)\\b(\\w+)(\\b\\W+\\1\\b)+";
        System.out.println(s1.replaceAll(regex,"$1"));

    }
}
