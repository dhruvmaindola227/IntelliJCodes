package javaAssignmentMCA;

import java.util.Scanner;

//Write a java program to count the number of words in a string
public class Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a string with multiple occurrences of a word.");
        String string = sc.nextLine();
        string = string.toLowerCase();
        //Split the string into words using built-in function
        String words[] = string.split(" ");
        System.out.println("The number of words in the given string is "+ words.length);
    }
}
