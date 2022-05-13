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
        list.deleteValue(10);
        list.display();
    }
}
