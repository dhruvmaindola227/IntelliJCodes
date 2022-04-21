package com.leetcodeQuestions;

public class LengthOfLastWord { //traverse from end and find the first space. when found just return the length that you've traversed.
    public static void main(String[] args) {
        String s="   fly me   to   hshs   ds jasklj sdn jasd jsd kjs; fkjahf ksj        the moodsdddsfasn  ";
        System.out.println(lengthOf(s));

    }

    static int lengthOf(String s){

            String s1=s.trim();
            char ch=' ';
            int i;
            for(i=s1.length()-1;i>=0;i--)
            {
                if(s1.charAt(i)!=ch)
                    continue;
                else break;
            }
            return s1.length()-1-i;

    }



}
