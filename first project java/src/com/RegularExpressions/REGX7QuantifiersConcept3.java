package com.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX7QuantifiersConcept3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a?"); //here (?) means atmost one a.
        Matcher m = p.matcher("abaabaaabaaaaaaaba");
        while (m.find()) {
            System.out.println(m.start() + "......" + m.group());
        }
    }
}
