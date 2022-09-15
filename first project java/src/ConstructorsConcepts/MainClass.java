package ConstructorsConcepts;

import java.util.Arrays;
import ConstructorsConcepts.Animal;

public class MainClass {
    public static void main(String[] args) {
       Animal dog = new Dog(); //runtime polymorphism //method overriding
       dog.makeNoise();
       Animal cat = new Cat();
       cat.makeNoise();
    }
}

 //  Ye side batayegi ki KYA KYA ACCESS KAR SAKTE HAIN = KONSA VALA ACCESS KARNA HAI
