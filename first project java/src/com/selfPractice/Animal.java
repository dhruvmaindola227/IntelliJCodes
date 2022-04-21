package com.selfPractice;

public class Animal {
    void makeNoise(){
        System.out.println("Im making noise");
    }
}

class Dog extends Animal{
    @Override
    void makeNoise() {
        System.out.println("woof");
    }
    void run(){
        System.out.println("im running");
    }
}

class Trial{
    public static void main(String[] args) {
       // Dog am= new Animal(); //cannot do this.
        Animal am= new Dog(); //can do this.
    }
}
