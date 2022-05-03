package com.leetcodeQuestions;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower" , "flow" , "flowing"};
        System.out.println(longestCommonPrefix(strs));
    }


        public static String longestCommonPrefix(String[] strs){
            int minLen = Integer.MAX_VALUE;
            int indexOfMinLen = -1;
            StringBuilder answer = new StringBuilder();
            for(int i = 0 ; i < strs.length ; i++ ){
                if(strs[i].length() < minLen){
                    minLen = strs[i].length(); //finding the string element with the smallest length.
                    indexOfMinLen = i; //and storing the index it is at.
                }
            }
            for(int i = 0 ; i < strs[indexOfMinLen].length() ; i++){
                //then traversing it char by char and comparing																				//char in the string elements in the array strs[ ].
                for(int j = 0 ; j < strs.length ; j++){
                    if(strs[indexOfMinLen].charAt(i) != strs[j].charAt(i)){
                        //if we find a character is not matching , just return.
                        return answer.toString();
                    }
                }
                answer.append(strs[indexOfMinLen].charAt(i)); //if that loop ends that means in all the elements we were
                //able to find the matching character. So just append it.
            }
            return answer.toString();
        }
    }

