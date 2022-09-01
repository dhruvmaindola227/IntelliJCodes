package com.RegularExpressions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX14PhoneNumberValidationTest2 {
    public static void main(String[] args) {
//        String regex="0?[789][0-9]{9}";\
         Map<String, String> map = new HashMap<>(Map.of(
                "111", "one",
                "222", "two",
                 "333" , "three",
                 "444" , "four",
                 "555", "five",
                 "666", "six",
                 "777" , "seven",
                 "888" , "eight",
                 "999", "nine"
        ));
        Pattern p= Pattern.compile("(\\d)\\1{2,}");
        String number= "9837772454";
        Matcher m=p.matcher(number);
        String angelNum = "";
        if(m.find())
                angelNum = m.group();
        System.out.println(map.get(angelNum));

    }
}
