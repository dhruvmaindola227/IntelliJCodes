package ConstructorsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class ParentClass {
    int parentProperty = 10;

    public ParentClass() {
        System.out.println("In no arguments constructor of ParentClass");
    }

    public ParentClass(int number){
        System.out.println("In ONE arg constructor of ParentClass");
        this.parentProperty = number;
    }
}


