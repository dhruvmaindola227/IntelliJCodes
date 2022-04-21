package javaAssignmentMCA;
//Write a java program to find the percentage of uppercase letters, lowercase letters, digits and special characters in a given string?
public class Q41{
    public static void main(String[] args) {
        String str = "^_^ ;-) THIS ASSIGNMENT is COMPLETELY POINTLESS WHY AM I DOING THIS EVEN ^_^ ;-) ";
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;
        char[] string = str.toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (Character.isUpperCase(string[i])) {
                upper++;
            } else if (Character.isLowerCase(string[i])) {
                lower++;
            } else if (Character.isDigit(string[i])) {
                digit++;
            } else {
                special++;
            }
        }
        System.out.println("Percentage of Uppercase letters: " + (upper / (double) string.length) * 100);
        System.out.println("Percentage of Lowercase letters: " + (lower / (double) string.length) * 100);
        System.out.println("Percentage of Digits: " + (digit / (double) string.length) * 100);
        System.out.println("Percentage of Special characters: " + (special / (double) string.length) * 100);

    }
}

