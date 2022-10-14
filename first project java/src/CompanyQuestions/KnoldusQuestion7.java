package CompanyQuestions;

import java.util.Arrays;
import java.util.Locale;

public class KnoldusQuestion7 {
    public static void main(String[] args) {
        String s = "cats AND*Dogs-are Awesome";
        s = s.replaceAll("[^a-zA-Z]" , " ");
        String[] words = s.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            char currentChar = words[i].charAt(0);
            words[i] = words[i].replace(currentChar , Character.toUpperCase(currentChar));
        }
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            ans.append(word);
        }
        System.out.println(ans);

    }
}
