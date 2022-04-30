package com.recursion;

public class SkipAChar {
    public static void main(String[] args) {
        System.out.println(skipA("bcaddasaaaaaaaaaaasdasdasdcasfasasdasdasdasdsa"));
    }
    public static String skipA(String s) {
        if (s.isEmpty()){
            return "";
        }
        if (s.charAt(0) == 'a'){
            return skipA(s.substring(1));
        } else {
            return s.charAt(0) + skipA(s.substring(1));
        }
    }
}
