package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsTogether {
    public static void main(String[] args) {
        String[] strings ={"tea","aet","bgc","cbg"};
        System.out.println(groupAnagramsTogether(strings));
    }

    public static List<List<String>> groupAnagramsTogether(String arr[]){
        HashMap<String, ArrayList<String>> map= new HashMap<>(); //taking a map with key as string and value as arraylist which
                                                                 //will contain the anagrams of that key string.
        for (int i = 0; i < arr.length; i++) {
            String s1=arr[i]; //storing the ith string element.
            char[] chars = s1.toCharArray(); //converting it to char array to sort it.
            Arrays.sort(chars); //sorting the char array
            String keyInMap=new String(chars); //storing it back into a string. Can also use String.valueOf(chars) here.
            if(map.containsKey(keyInMap))
            {
                map.get(keyInMap).add(s1);  //if it does exist already then just add it into the corresponding arraylist.
            }
            else{
                map.put(keyInMap,new ArrayList<String>()); //if the map doesn't contain the key string , then add a corresponding
                                                           // arraylist to it.
                map.get(keyInMap).add(s1);                  //then add the ith string into the arraylist
            }
        }
        return new ArrayList<>(map.values());  //take all the arraylist values and pass it as an arraylist.
    }
}
