package com.selfPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class First {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(1, "Dhruv");
        hm.put(2,"Bro");
        Set s= hm.keySet();
         System.out.println(s);
         Iterator it=s.iterator();
         while(it.hasNext()){
             Integer i=(Integer)it.next();
             String s1=(String)hm.get(i);
             System.out.println("Key " + i + " value " + s1);
         }
         BiConsumer<Integer,String> bi=(a, b)->System.out.println("key " + a + " value "+ b);
         hm.forEach(bi);
         hm.forEach((a,b) -> System.out.println(a+b));

         hm.entrySet().forEach((a) -> System.out.println("key is "+ a.getKey() + " value is "+ a.getValue()));
    }
}
