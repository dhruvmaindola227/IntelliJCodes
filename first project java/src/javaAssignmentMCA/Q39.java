package javaAssignmentMCA;
//Write a java program to reverse each word of a given string?
public class Q39 {
    public static void main(String[] args) {
        String s="This is a string with a lot of words";
        StringBuffer s1= new StringBuffer(s);
        System.out.println(s1.reverse());
    }
}
