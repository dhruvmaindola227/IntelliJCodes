package com.leetcodeQuestions;

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }
    public static boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        StringBuilder temp =new StringBuilder(s);
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){ //check if its palindrome normally
                start++;
                end--;
            }
            else{ //if a character mismatch is there then check the string for palindrome after deleting the characters at
                //first the start pointer and then the end pointer.

                temp.deleteCharAt(start); //delete the character at the start position pointer.
                if(checkPalindromePossible(temp.toString())) //and check if that string is palindrome
                    return true; //if it is then found answer
                else{

                    temp.insert(start,s.charAt(start));  //if not then put that character back at its original position ,
                    temp.deleteCharAt(end);     //instead now delete the character at the other pointer.
                    return checkPalindromePossible(temp.toString());  //and check with that. whatever the result is just return                                                                       //it
                }
            }
        }
        return true; //if the starting while loop breaks mean its a normal palindrome.
    }

    public static boolean checkPalindromePossible(String s){ //seperate function is made because in the first function we are
        //giving it the possibility of being a palindrome but here its
        //strict as in the second a mismatching character is found , it
        //returns false.
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
