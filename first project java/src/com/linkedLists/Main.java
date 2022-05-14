package com.linkedLists;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.add(20);
//        list.add(100);
//        list.deleteValue(100);
//        list.display();
        DLL list = new DLL();
        list.insertFirst(20);
        list.insert(20 , 30);
        list.insertLast(40);
        list.display();
    }
}
