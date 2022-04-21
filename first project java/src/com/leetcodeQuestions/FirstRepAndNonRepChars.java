package com.leetcodeQuestions;

public class FirstRepAndNonRepChars {
    public static void main(String[] args) {
        answer("andfjndkjfnaddf ");
    }

    public static void answer(String s) {
        int repflag = 0; //if its zero that means it has not been printed yet.
        int nrepflag = 0;
        for(int i=0;i<s.length();i++)
        {   if(repflag==0 || nrepflag==0) { //if either the rep. char or the non rep. hasnt been found already then search.
            if (s.substring(i+1,s.length()).indexOf(s.charAt(i)) == -1) {
                if(nrepflag==0) { //if it doesnt exist then check if we havent already found the nonrep char.
                    nrepflag = 1; //if no then set the flag to 1
                    System.out.println("First non repeating Character is " + s.charAt(i)); //print the element
                }
            } else {
                if(repflag==0) { //if it does exist then check if we havent already found the rep char
                    repflag = 1; //set the flag to 1
                    System.out.println("First repeating character is " + s.charAt(i));
                }
            }
        }
        else break; //if we have already found the rep and the non rep character so no need to look ahead just break.
        }
    }
}
