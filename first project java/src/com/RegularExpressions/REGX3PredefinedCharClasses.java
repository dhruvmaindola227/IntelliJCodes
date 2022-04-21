package com.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX3PredefinedCharClasses {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[^\\d\\W]");
        Matcher m=p.matcher("a7b k@9Z");
        while(m.find()){
            System.out.println(m.start()+" "+m.group());
        }

    }
}
