package com.RegularExpressions;

/**s=race: car -> actual = racecar(after removing the space and the ':' character.) **/
public class REGX4ValidPalindromeLeetcodeUsingRegex {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));
    }
    /**removing the spaces and special characters.
     using regex. Then we have a string with no
     spaces and then just reversing it and checking
     it with the original string to check for palindrome*/
    public static boolean validPalindrome(String s){
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}