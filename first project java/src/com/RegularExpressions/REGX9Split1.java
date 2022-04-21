package com.RegularExpressions;

import java.util.Arrays;
import java.util.regex.Pattern;

public class REGX9Split1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("o*");
        String[] s=p.split("Durga Software Solutions");
        for (String element: s) {
            System.out.println(element);
        }
        System.out.println(Arrays.toString(s));
    }
}
