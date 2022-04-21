package com.RegularExpressions;

public class REGX15PhoneNumberValidationTest3 {
    public static void main(String[] args) {
        String regex="(0|91)?[7-9][0-9]{9}" ;
        String number="918234567898";
        if(number.matches(regex)){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
}
