package com.RegularExpressions;

public class REGX17EmailIdVerificationGmail {
    public static void main(String[] args) {
        String s="maindola.dhruv@gmail.co.in";
        String regex="[\\w][\\w._]*@gmail[.][a-zA-z]+";
        if(s.matches(regex)){
            System.out.println("correct");
        }
        else{
            System.out.println("incorrect");
        }
    }
}
