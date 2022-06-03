package CompanyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CventQuestion2 {
    public static void main(String[] args) {
        String string = "aaabbbccccdddeffasafaefvsfsrsdtsedgergtsd";
        System.out.println(minCharToRemove(string));
    }
    //aaabbbccccdddeff
    public static int minCharToRemove(String string) {
        Map<Character ,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(new ArrayList<>());
        }
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if(!map.containsKey(string.charAt(i))){
                map.put(string.charAt(i) , 1);
            }else{
                map.put(string.charAt(i),map.get(string.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < string.length(); i++) {
            if(map.get(string.charAt(i)) % 2 != 0){
                list.get(1).add(string.charAt(i));
            }else{
                list.get(0).add(string.charAt(i));
            }
        }
//        return counter;
//        System.out.println(map);
        System.out.println(list);
        return list.get(1).size();
    }
}
