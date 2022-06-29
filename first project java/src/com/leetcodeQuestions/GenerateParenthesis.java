package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int numOfBrackets = 2;
        System.out.println(generateParenthesis(numOfBrackets));
    }

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> answer = new ArrayList<>();
        backtrack(answer , new StringBuilder() , 0 , 0 , n);
        return answer;
    }

    public static void backtrack(ArrayList<String> answer , StringBuilder current , int open , int close , int maxBrackets){
        //base condition
        if(current.length() == maxBrackets * 2){
            answer.add(current.toString()); //toString() because current is a string builder.
            return ;
        }

        if(open < maxBrackets){
            current.append("(");
            backtrack(answer , current , open + 1 , close , maxBrackets);
            current.deleteCharAt(current.length() - 1); //delete the last character when recursive call is coming back.
        }

        if(close < open){
            current.append(")");
            backtrack(answer , current , open , ++close , maxBrackets);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
