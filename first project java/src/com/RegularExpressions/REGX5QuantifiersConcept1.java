package com.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX5QuantifiersConcept1 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("a+"); //here (+) means atleast once or more than once.
        //so if we give a+ that means find a wherever it is either atleast once or more than once continuously.

        Matcher m=p.matcher("abaabaaab");

        while(m.find()){
            System.out.println(m.start()+"......"+ m.group());

        }
    }
}
