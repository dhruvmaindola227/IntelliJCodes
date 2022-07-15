package javaAssignmentMCA;

import java.sql.Array;
import java.util.Scanner;

//Write a java program to find all permutations of a string.
public class Q45 {
    static void permutation(String s, String answer) {
        if (s.length() == 0) {
            System.out.print(answer + "  ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permutation(rest, answer + ch);
        }
    }

    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        String s;
//        String answer = "";
//
////        String s1 = "c";
////        System.out.println(s1.substring(0));
//        System.out.print("Enter the string : ");
//        s = scan.next();
//        System.out.print("All possible strings are : ");
//        permutation("abc","");
//        scan.close();
        String s= "sdnjkans";
        String s2 = "sdn";
        System.out.println(s.contains(s2));
    }
}

