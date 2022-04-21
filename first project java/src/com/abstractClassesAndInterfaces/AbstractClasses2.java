package com.abstractClassesAndInterfaces;

abstract class AbstractClasses2 extends AbstractClasses1 {
    @Override
    void m1() {
        System.out.println("NAmaste");
    }
}

class Abstr extends AbstractClasses2{
    public static void main(String[] args) {
        Abstr a=new Abstr();
        a.m1();
        a.m2();
        a.m3();
    }
    @Override
    void m2() {
        System.out.println("nammmm");
    }

    @Override
    void m3() {
        System.out.println("mfkdmfel");
    }

}
