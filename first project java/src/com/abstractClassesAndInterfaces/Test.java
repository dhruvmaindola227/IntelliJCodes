package com.abstractClassesAndInterfaces;

public class Test implements Interface,Interface2 {
    @Override
    public void m1() {
        System.out.println("m1");
    }
    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }

    @Override
    public void m4() {
        System.out.println("m4");
    }

    @Override
    public void m5() {
        Interface2.super.m5();

    }

    public static void main(String[] args) {
        Test t= new Test();
        t.m1();
        t.m2();
        t.m3();
        t.m4();
        t.m5();
        Interface2.m6(); //because the m6() is a static method inside the Interface2.

    }
}
