package com.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX2CharClassesConcept {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[^a-b0-9]");
        Matcher m= p.matcher("a7b@2#9");
        while(m.find()){
            System.out.println(m.start()+" "+ m.group());
        }
    }
}
