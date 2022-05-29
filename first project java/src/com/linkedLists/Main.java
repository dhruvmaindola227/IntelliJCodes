package com.linkedLists;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.add(20);
//        list.add(100);
//        list.deleteValue(100);
//        list.display();
            LL list = new LL();
            list.insertFirst(10);
            list.insertFirst(20);
            list.insertLast(30);
            list.insertRec(60 , 0);
            list.display();
            list.reverse(list.get(0));
            list.display();


    }
}
