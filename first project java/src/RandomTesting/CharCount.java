package RandomTesting;

import java.util.Arrays;
import java.util.LinkedList;

public class CharCount {
    public static void main(String[] args) {
        String name = "aaaaabcccc";
        charCount(name);
    }

    public static void charCount(String string) {
       int[] freq = new int[26]; //frequency array
        for (int i = 0; i < string.length(); i++) {
            freq[(int)string.charAt(i) - 97] += 1;
        }
        System.out.println(Arrays.toString(freq));
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0)
                System.out.println((char)(i+97) + " is occuring " + freq[i] + " number of times");
        }
    }
}
