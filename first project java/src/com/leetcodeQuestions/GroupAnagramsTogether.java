package com.leetcodeQuestions;

import java.util.*;

public class GroupAnagramsTogether {
    public static void main(String[] args) {
        String[] strings ={"tea","aet","bgc","cbg","tae"};
//        System.out.println(groupAnagramsTogether(strings));
        System.out.println(groupAnagramsTogether2(strings));
    }

    public static List<List<String>> groupAnagramsTogether(String[] arr){
        HashMap<String, ArrayList<String>> map= new HashMap<>(); //taking a map with key as string and value as arraylist which
                                                                 //will contain the anagrams of that key string.
        //storing the ith string element.
        for (String s1 : arr) {
            char[] chars = s1.toCharArray(); //converting it to char array to sort it.
            Arrays.sort(chars); //sorting the char array
            String keyInMap = new String(chars); //storing it back into a string. Can also use String.valueOf(chars) here.
            //then add the ith string into the arraylist
            if (!map.containsKey(keyInMap)) {
                map.put(keyInMap, new ArrayList<String>()); //if the map doesn't contain the key string , then add a corresponding
                // arraylist to it.
            }
            map.get(keyInMap).add(s1);  //if it does exist already then just add it into the corresponding arraylist.
        }
        return new ArrayList<>(map.values());  //take all the arraylist values and pass it as an arraylist.
    }

    public static List<List<String>> groupAnagramsTogether2(String[] arr){
        Map<ArrayList<Integer>,ArrayList<String>> map= new HashMap<>();
        for(String string : arr){
            ArrayList<Integer> strInMap = new ArrayList<>(charCountList(string));
            if(!map.containsKey(strInMap)){
                map.put(strInMap , new ArrayList<>());
            }
            map.get(strInMap).add(string);
        }
        return new ArrayList<>(map.values());
        
    }
    
    public static ArrayList<Integer> charCountList(String string){
       int[] count = new int[26];
        for (int i = 0; i < string.length(); i++) {
           count[string.charAt(i) - 'a']++;
        }

        ArrayList<Integer> list = new ArrayList<>(count.length);
        for (int num : count){
            list.add(num);
        }
        return list;

    }
}
