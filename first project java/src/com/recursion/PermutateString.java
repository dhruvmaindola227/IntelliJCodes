package com.recursion;

import java.util.ArrayList;

public class PermutateString {
    public static void main(String[] args) {
        System.out.println("Ans is "+ SubSequence1("","226"));
        SubSequence("","abc");
    }

    public static void SubSequence(String p , String up) {
        if (up.isEmpty()){
            System.out.print(p + " " );
            return ;
        }
        char ch = up.charAt(0) ;
        SubSequence(p + ch , up.substring(1));
        SubSequence(p , up.substring(1));
    }

    public static ArrayList<String> SubSequence1(String p , String up) {
        ArrayList<String> arr = new ArrayList<>();
        if (up.isEmpty()){
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0) ;
         arr.addAll(SubSequence1(p + ch , up.substring(1)));
//        System.out.println("p is "+p+" and up is "+ up + " "+arr);
         arr.addAll(SubSequence1(p , up.substring(1)));
//        System.out.println("p is "+p+" and up is "+ up + " "+arr);
        return arr;
    }
}
