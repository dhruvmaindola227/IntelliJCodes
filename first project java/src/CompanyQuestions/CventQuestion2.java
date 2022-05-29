package CompanyQuestions;

import java.util.HashMap;
import java.util.Map;

public class CventQuestion2 {
    public static void main(String[] args) {
        String string = "aaabbbccccdddeff";
        System.out.println(minCharToRemove(string));
    }

    public static int minCharToRemove(String string) {
        Map<Character , Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if(!map.containsKey(string.charAt(i))){
                map.put(string.charAt(i) , 1);
            }else{
                map.put(string.charAt(i),map.get(string.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character , Integer> key : map.entrySet()) {
            if (key.getValue() % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
