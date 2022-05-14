package com.linkedLists;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(234);
        list.display();
        list.insert(100 , 2);
        list.insert(1000 , 6);
        list.display();
        System.out.println(list.size);
        list.deleteValue(1000);
        list.display();
        System.out.println(list.size);
    }
}
