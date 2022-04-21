package javaAssignmentMCA;
//Write a java program to swap two string variables without using third or temp variable in java.
public class Q44 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "C++";
        System.out.println("Before swapping: " + str1 + " " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swapping: " + str1 + " " + str2);
    }
}

