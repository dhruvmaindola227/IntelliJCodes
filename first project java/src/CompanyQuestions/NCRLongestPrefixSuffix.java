package CompanyQuestions;

import java.util.HashSet;

public class NCRLongestPrefixSuffix {
    public static void main(String[] args) {
        String s = "abcdefabc";
        System.out.println(lengthOfLongestPrefixSuffix(s));
        HashSet<Integer> set = new HashSet<>();
    }

    public static int lengthOfLongestPrefixSuffix(String s) {

        int firstSubstr = s.length() - 1;
        int secSubstr = 1;
        while(firstSubstr!=0){
            String substr_left_to_right = s.substring(0,firstSubstr);
            String substr_right_to_left = s.substring(secSubstr);
            if(substr_left_to_right.equals(substr_right_to_left)){
                return substr_left_to_right.length();
            }
            firstSubstr--;
            secSubstr++;
        }
        return -1;
    }



}
