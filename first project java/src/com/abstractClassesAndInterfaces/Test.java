package com.abstractClassesAndInterfaces;

public class Test extends AbstractClasses1 implements Interface,Interface2 {
    @Override
    public void m1(){
        System.out.println("abstract class m1");
    }

    @Override
    void m2() {
        System.out.println("erda");
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
        AbstractClasses1 test = new Test();
        Interface2 int2 = new Test();
//        test.m1();
//        test.m5();
//        test.m2();
        test.m3();
        int2.m4();
        Interface2.m6(); //because the m6() is a static method inside the Interface2.
        Interface inte = () -> System.out.println("m1 is called");
        inte.m1();
    }
}
