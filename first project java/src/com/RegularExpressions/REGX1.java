package com.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab"); //giving the pattern we are looking for
        Matcher m=p.matcher("ababbaba"); //giving the string WHERE we are looking for the pattern
        while(m.find()){
            System.out.println(m.start()+" "+m.end()+" "+ m.group()); //end() internally returns end index + 1 value.
                                                                      //group() returns the string that was matched.
        }
    }
}
