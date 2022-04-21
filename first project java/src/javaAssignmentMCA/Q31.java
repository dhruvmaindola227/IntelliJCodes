package javaAssignmentMCA;

import java.util.ArrayList;
import java.util.Scanner;

//Write a java program to count the total number of occurrences of a given character in a string without using any loop?
public class Q31 {
    static ArrayList<Character> ans= new ArrayList<>();
    static int index=0;
    static int nextIndex=1;
    static int count=1;
    public static void main(String[] args) {
        String string="Mississipi";
        ArrayList<Character> ch1= characters(string);
//        System.out.println(ans);
        printCountOfCharacters(ch1);
    }

    public static ArrayList<Character> characters(String s){
        return helper(s,index);
    }
    public static ArrayList<Character> helper(String s, int index){
        if(index==s.length())
        {
            return ans;
        }
        if(index==s.length()-1 && index==nextIndex) {
//            index=0;
            return ans;
        }
        if(nextIndex==s.length()){
            nextIndex=0;
            return helper(s,++index);
        }
        if(index==nextIndex) {
            ++nextIndex;
            return helper(s, index);
        }
        if(s.charAt(index)==s.charAt(nextIndex) && index>nextIndex)
        {
            nextIndex=0;
           return helper(s,++index);
        }
        else if(s.charAt(index)==s.charAt(nextIndex))
        {
            ans.add(s.charAt(index));
            nextIndex++;
            return helper(s,index);
        }
        else {
            ++nextIndex;
            return helper(s,index);
        }

    }
    public static void printCountOfCharacters(ArrayList<Character> ch1){
        if(index<ch1.size()-1) {
            if(ch1.get(index) == ch1.get(index + 1)) {
                ++count;
            } else {
                System.out.println(ch1.get(index) + " has occurred " + (count+1) + " times " );
                count = 1;
            }
            ++index;
            printCountOfCharacters(ch1);
        }
        else
        {System.out.println(ch1.get(index) + " has occurred " + (count+1) + " times ");}
    }
}
