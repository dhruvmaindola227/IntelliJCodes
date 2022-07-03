package CompanyQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String s= "geeksforgeeks";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
