package com.selfPractice;

import java.util.HashMap;
import java.util.TreeSet;

public class TryingHashmaps {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm1= new HashMap<>();
        HashMap<Integer,String> hm2= new HashMap<>();
        hm1.put(1,0);
        hm1.put(2,1);
        hm1.put(3,2);
        hm2.put(1,"Dhruv");
        hm2.put(2,"Maindola");
        System.out.println(hm1.put(1,hm1.get(1)+1));

//        System.out.println(hm1.get(4));
        System.out.println(hm2.get(2));
    }
}
