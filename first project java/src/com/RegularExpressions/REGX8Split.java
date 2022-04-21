package com.RegularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX8Split {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("\\s+"); // (\\s+) means either one or more than one space if found then split the string there.
        String[] s=p.split("Split         this    weird ass   sentence");
        for(String element:s){
            System.out.println(element);
        }
        System.out.println(Arrays.toString(s));
    }
}
