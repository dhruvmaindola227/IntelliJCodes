package CompanyQuestions;

import java.util.Arrays;

public class KnoldusQuestion5 {
    public static void main(String[] args) {
        String s = "abc1*kyoo";
        System.out.println(splitWords(s));
    }

    public static String splitWords(String s) {
        String[] words = s.split("[*]");
        System.out.println(Arrays.toString(words));
        String firstWord = words[0];
        String secondWord = words[1];
        StringBuilder sb = new StringBuilder();
        int first = 0;
        int second = 0;
        while(first < firstWord.length() && second < secondWord.length()){
            sb.append(firstWord.charAt(first));
            sb.append(secondWord.charAt(second));
            first++;
            second++;
        }
        return sb.toString();
    }
}
