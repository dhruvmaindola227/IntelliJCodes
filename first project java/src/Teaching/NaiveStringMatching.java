package Teaching;

import java.util.ArrayList;

public class NaiveStringMatching {
    public static void main(String[] args) {
        String string = "manjari";
        String pattern = "Manjari";
        if(string.contains(pattern)){
            System.out.println(true);
        }

        System.out.println(string.hashCode());
        System.out.println(pattern.hashCode());

//        System.out.println(listOfOccurences(string , pattern));
    }
    //we are finding out all possible SUBSTRINGS of length of pattern from start in string.
    public static ArrayList<Integer> listOfOccurences(String string , String pattern){
        ArrayList<Integer> indices = new ArrayList<>();
        String sb = "";
        for (int i = 0; i < string.length() - pattern.length(); i++) {
            sb = "";
            for (int j = i; j < i + pattern.length(); j++) {
                sb += string.charAt(j);
            }
            if(sb.equals(pattern)){
                indices.add(i);
            }
        }
        return indices;
    }
}
