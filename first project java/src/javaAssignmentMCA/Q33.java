package javaAssignmentMCA;

import java.util.ArrayList;

//Write a java program to count the number of occurrences of each character in a string?
public class Q33 {
    public static void main(String[] args) {
        String s="Assignment";
        ArrayList<Character> ans= new ArrayList<>();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            count=0;
            if(!ans.contains(s.charAt(i))) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        ans.add(s.charAt(i));
                        count++;
                    }
                }
                System.out.println(ans.get(ans.size()-1) + " has appeared "+ (count) + " times");
            }

        }
    }
}
