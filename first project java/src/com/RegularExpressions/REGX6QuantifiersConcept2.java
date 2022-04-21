package com.RegularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX6QuantifiersConcept2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*"); //here (*) means zero or more than zero.
        //so if we give a* that means find a wherever it is present zero times or more than zero continuously.

        Matcher m = p.matcher("abaabaaab");

        while (m.find()) {
            System.out.println(m.start() + "......" + m.group());
        }
    }
}
