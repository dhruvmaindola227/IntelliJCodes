package javaAssignmentMCA;

import java.util.ArrayList;
import java.util.Scanner;

//Write a java program to count the total number of occurrences of a given character in a string without using any loop?
public class DuplicateCharCountingUsingRecursion {
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
        return helper(s,index); //because we dont want to take index value from user when calling the function , we are using a helper function.
    }


    /*Basically we are using a 2 pointer approach. index is the current index character we are finding , nextIndex is the index WHERE we
     * currently are and matching if the character at index pointer and the character at nextIndex pointer are the same character.*/

    public static ArrayList<Character> helper(String s, int index){
        /*This is a special case handled because in the runtime stack at one position it will try to increment the index and that will lead to
         StringOutOfBoundsException so to handle that we have written this.**/
        if(index==s.length())
        {
            return ans;
        }
        /*This means that we have reached the end of the string and our lastindex is also at the last so just set index back to 0 because
         * we will need the index to be 0 for the next function and then return the ans arraylist.**/
        if(index==s.length()-1 && index==nextIndex) {
            index=0;
            return ans;
        }
        /*This means that if the nextIndex pointer has reached out of string , that means for the current particular index,
         * we have reached the end of the string and now we should search for the next index value , so for the nextIndex value
         * we should obviously set the nextIndex pointer to the starting point.**/
        if(nextIndex==s.length()){
            nextIndex=0;
            return helper(s,++index);
        }
        /*I am not counting the characters when both the pointers are at the same index.
        for ex - "hehlo": index==nextIndex = 0 , skip the 'h' because h is appearing one time obviously. We just need to find its repitition.**/
        if(index==nextIndex) {
            ++nextIndex;
            return helper(s, index);
        }

        /*for example = "aaaa" , here for index=0 , we will find the match at nextIndex 1,2,3 and we will append them.
         * But when we try to find for the character 'a' at index=1 , nextIndex will have been set to 0.
         * Here we are checking that if the character at the current index value{1} is same as nextIndex{0} and index>nextIndex
         * that means that this check is a redundant check and we should just move on to the next index**/
        if(s.charAt(index)==s.charAt(nextIndex) && index>nextIndex)
        {
            nextIndex=0;
            return helper(s,++index);
        }
        /*if the characters are same and the index is not greater than the nextIndex value so then just append the character and then call again
         * for the newly incremented nextIndex value to match with the current index value.**/
        else if(s.charAt(index)==s.charAt(nextIndex))
        {
            ans.add(s.charAt(index));
            nextIndex++;
            return helper(s,index);
        }
        /*If they are not same then call for nextIndex value corresponding to the current index value.**/
        else {
            ++nextIndex;
            return helper(s,index);
        }

    }


    /*This is the function to traverse the array returned by the characters() function and then print the final answer.*/

    public static void printCountOfCharacters(ArrayList<Character> ch1){
        //Going till the second last element because we are checking for the next element always.
        //so to avoid ArrayIndexOutOfBoundsException , going only till the second last element.
        if(index<ch1.size()-1) {
            //check if the next element in the array is same , if yes then increment count and index and call the same function
            if(ch1.get(index) == ch1.get(index + 1)) {
                ++count;
            } else {
                //if its not the same then print the current index character and its count. set count to 1 and then repeat the function.
                //count+1 because we skipped the index==nextIndex case in the previous function.
                System.out.println(ch1.get(index) + " has occurred " + (count+1) );
                count = 1;
            }
            ++index;
            printCountOfCharacters(ch1);
        }
        else
        //this means that all the elements up till the second last have been printed and now we want to print the character and it's count
        //before the function ends and is removed from the stack memory.
        {
            System.out.println(ch1.get(index) + " has occurred " + (count+1) + " times ");
        }
    }


}

