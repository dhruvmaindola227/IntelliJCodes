package com.abstractClassesAndInterfaces;

public interface Interface2 {
    void m3();
    void m4();
    default void m5(){ //default keyword and its application came after jdk-8.
        System.out.println("m5");
    }
    static void m6(){
        System.out.println("m6");
    }

}
