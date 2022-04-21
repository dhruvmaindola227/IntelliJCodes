package com.RegularExpressions;

import java.util.regex.Pattern;

public class REGX11SplitOfStringClass1 {
    public static void main(String[] args) {
        String s="fmksfm skd ksmd ksm      dks      ";
        String[] arr= s.split("\\s+");
        for(String element:arr){
            System.out.println(element);
        }
    }
}
