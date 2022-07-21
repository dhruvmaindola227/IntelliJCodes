package RandomTesting;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapStreamTrial {
    public static void main(String[] args) {
        Map<Character , Integer> charCount = new HashMap<>();
        charCount.put('a' , 3);
        charCount.put('f' , 21);
        charCount.put('b' , 4);
        charCount.put('z' , 23);
        int max = 0;
        System.out.println(charCount.values().stream().max((ch1,ch2) -> ch1 - ch2).orElse(null));
        charCount.put('a' , charCount.get('a') - 1);
        System.out.println(charCount);
//        List<Integer> list = charCount.values().stream().sorted().collect(Collectors.toList());
//        System.out.println(list);
        for(Map.Entry<Character , Integer> entry : charCount.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
