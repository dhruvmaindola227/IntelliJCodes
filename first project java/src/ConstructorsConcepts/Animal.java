package ConstructorsConcepts;

import RandomTesting.AbstractClasses;

public class Animal {
    void makeNoise(){
        System.out.println("Animal making noise!");
    }
}

class Dog extends Animal{
    @Override
    void makeNoise() {
        System.out.println("Dog is Barking!");
    }

    boolean hasTail;
}

class Cat extends Animal{
    @Override
    void makeNoise() {
        System.out.println("Cat is meowing!");
    }
    boolean hasTail;
}
