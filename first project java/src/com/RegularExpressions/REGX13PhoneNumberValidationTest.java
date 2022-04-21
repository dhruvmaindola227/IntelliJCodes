package com.RegularExpressions;

import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX13PhoneNumberValidationTest  {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[789][0-9]{9}"); //telling that first character should either be 7 or 8 or 9 and
                                                     //remaining 9 should be 0-9 and exactly 9 characters only.
        Matcher m=p.matcher("8891909189");
        if(!m.find()) //if the matching regex is false.
        {
            System.out.println("Invalid number"); //print invalid.
        }
        else System.out.println("Valid number");  //otherwise valid.

    }
}
