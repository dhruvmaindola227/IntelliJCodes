package Teaching;

import java.util.ArrayList;

public class NaiveStringMatching {
    public static void main(String[] args) {
        String string = "aacbcedaacvacaava";
        String pattern = "aac";
        System.out.println(listOfOccurences(string , pattern));
    }

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
