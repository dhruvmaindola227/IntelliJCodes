package com.linkedLists;

public class LinkedList {
    int size;
    Node head;
    Node tail;
    Node temp;
    LinkedList(){
        this.size = 0;
    }

    void add(int value){
    if(size == 0){
        Node node = new Node(value);
        node.next = null;
        head = node;
        tail = node;
        size++;
        return ;
    }
    temp = tail;
    Node node = new Node(value);
    temp.next = node;
    tail = node;
    size++;
    }

    void insert(int value , int index){
        Node tempo = head;
        for (int i = 1; i < index-1; i++) {
            tempo = tempo.next;
        }
        Node node = new Node(value);
        node.next = tempo.next;
        tempo.next = node;
        size++;
    }

    void deleteValue(int value){
        if(size == 1){
            head.next = null;
        }
        Node tempo = head;
        Node prev = null;
        while(tempo != null){
            if(head.value == value){
                prev = tempo;
                tempo = tempo.next;
                head = tempo;
                prev.next = null;
                size--;
                return;
            }
            if(tempo.value == value){
                prev.next = tempo.next;
                tempo.next = null;
                size--;
                return;
            }
            else{
                prev = tempo;
                tempo = tempo.next;
            }


        }

    }


    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value , Node next){
            this.value = value;
            this.next = next;
        }

    }
}
