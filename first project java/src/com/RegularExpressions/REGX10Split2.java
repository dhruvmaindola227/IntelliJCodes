package com.RegularExpressions;

import java.util.Arrays;
import java.util.regex.Pattern;

public class REGX10Split2 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("a[.]"); // (\\.) means treat the (.) as a symbol or can just give "[.]"
        String[] s=p.split("www.durgasoftwaresolutions.com");
        for(String element:s){
            System.out.println(element);
        }
        System.out.println(Arrays.toString(s)); //this internally adds a space on the place where the matching regex symbol was.
    }
}
