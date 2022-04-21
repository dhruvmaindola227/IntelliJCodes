package com.selfPractice;

public class RegexPractice2 {

    public static void main(String[] args) {
        String s1= "";
        if(s1.matches("(hello)*")){
            System.out.println("valid");
        }
        else System.out.println("invalid");
    }
}
