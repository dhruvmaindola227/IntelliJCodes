package CompanyQuestions;

import java.util.Arrays;

public class KnoldusQuestion1 {
    //return the highest length word excluding the special characters in the words
    public static void main(String[] args) {
        String s = "Hello^* &%*&oooooo! To the world of Ques*)*^tions";
        System.out.println("length is => " + lengthOfWordExcludingSplChars(s));
    }

    public static int lengthOfWordExcludingSplChars(String s){
        String[] words = s.split("[\\s]+"); //split using 1 or more spaces
        System.out.println("original -> " + s);
        int maxLength = Integer.MIN_VALUE;
        int lengthOfString = 0;
        for(String word : words){
            lengthOfString = word.replaceAll("[^a-zA-Z]" , "").length();
            //replace all characters except a to z or A to Z with "".

            System.out.print(word.replaceAll("[^a-zA-Z]" , "") + " ");
            maxLength = Math.max(maxLength , lengthOfString);
        }
        System.out.println();
        return maxLength;
    }
}
