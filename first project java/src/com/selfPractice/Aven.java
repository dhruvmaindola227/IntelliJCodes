package com.selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Base{
    void show(){
        System.out.println("Base Show");
    }
}

class Derived extends Base{
    void show(){
        System.out.println("Dervied show");
    }
}
 class Aven {
    public static void main(String[] args) {
         Base b = new Derived();
        b.show();

    }
    }

