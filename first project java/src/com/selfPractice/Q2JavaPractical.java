package com.selfPractice;

import java.util.TreeSet;

public class Q2JavaPractical {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10); //adding multiple 10's to show that treeset doesnt store duplicate values.
        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(15);
        System.out.println(treeSet); //prints the treeset in ascending order on its own even though insertion has
                                     //been done in random order.
    }
}
