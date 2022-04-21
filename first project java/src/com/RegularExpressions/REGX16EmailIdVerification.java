package com.RegularExpressions;

public class REGX16EmailIdVerification {
    public static void main(String[] args) {
        String s= "m.dh2ruv@gmail.co.in";
        String regex="[\\w][\\w_.]*@[\\w]+([.][a-zA-z]+)+";
        if(s.matches(regex)){
            System.out.println("correct email id");
        }
        else{
            System.out.println("Incorrect Email Id");
        }
    }
}
