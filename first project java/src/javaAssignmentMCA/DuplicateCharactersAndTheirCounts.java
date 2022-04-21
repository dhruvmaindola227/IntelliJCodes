package javaAssignmentMCA;

import java.util.ArrayList;
import java.util.Scanner;

//Write a java program to find the duplicate words and their number of occurrences in a string.
public class DuplicateCharactersAndTheirCounts {
    public static void main(String[] args) {
        int count=1;
        int lastIndex=0;
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//taking the input from the user.
        ArrayList<Character> ch1= characters(s); //Taking the returned arraylist from the function and storing it to perform calculations on it.

        for(int i=0;i<ch1.size()-1;i++)
        {
            if(ch1.get(i)==ch1.get(i+1))
                count++;
            else if(ch1.get(i)!=ch1.get(i+1))
            {   /*Since the array the function returned , returns the character being repeated n-1 times , we need to add 1 to the
                   the final count value for the particular character.*/
                System.out.println(ch1.get(i)+" has occurred "+ (count+1)+ " times");
                count=1;
            }
            lastIndex=i;
        }
        System.out.println(ch1.get(lastIndex)+" has occurred "+ (count+1)+ " times");
    }
    /*function that returns an arraylist of characters that are being repeated.
    * For an input such as "mississipi" it will return [i,i,i,s,s,s]
    * The characters are appearing n-1 times because we are skipping for the same i and j*/
    public static ArrayList<Character> characters(String s){
        ArrayList<Character> ch= new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            /*Check if the current element is already in the arraylist. if yes then no need to find again.*/
            if(!ch.contains(s.charAt(i))) {
                for (int j = 0; j < s.length(); j++) {
                    if (i == j)
                        continue;
                    if (s.charAt(i) == s.charAt(j))
                        ch.add(s.charAt(i));
                }
            }
        }
        return ch;
    }

}
