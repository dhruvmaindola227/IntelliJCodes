package CompanyQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class KnoldusQuestion2 {
    public static void main(String[] args) {
        String[] arr = {"Hello" , "world" , "code" , "ew"};
        System.out.println(thirdLargestWord(arr));
    }
    public static String thirdLargestWord(String[] arr) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(arr));
        words.sort((o1,o2) -> o1.length() - o2.length());
        return words.get(words.size() - 3);
    }
 }
