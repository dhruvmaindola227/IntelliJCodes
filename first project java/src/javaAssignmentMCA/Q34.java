package javaAssignmentMCA;
//Write a java program to remove all white spaces from a string?
public class Q34 {
    public static void main(String[] args) {
        String s="Hey this string       has a lot of white spaces.";
        s = s.replaceAll("\\s", "");
        System.out.println(s);
    }
}
