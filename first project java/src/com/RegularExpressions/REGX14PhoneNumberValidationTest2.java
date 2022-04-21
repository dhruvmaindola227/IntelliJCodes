package com.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGX14PhoneNumberValidationTest2 {
    public static void main(String[] args) {
        String regex="0?[789][0-9]{9}";
        String number= "993777777777";
        if(number.matches(regex)){ //use matches method of String class , it is better.
            System.out.println("valid number");
        }else{
            System.out.println("invalid number");
        }

    }
}
