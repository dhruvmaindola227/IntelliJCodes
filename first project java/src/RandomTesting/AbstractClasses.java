package RandomTesting;

public class AbstractClasses {
    public static void main(String[] args) {
        B ref = new B();
        ref.m1();
        ref.m2();
    }
}
//no argument constructor of the parent class will always be called by the compiler.
abstract class A {
    A(){
        System.out.println("A Constructor called");
    }
    abstract void m1();
    void m2(){
        System.out.println("In m2");
    }
}

class B extends A{
    B(){
        System.out.println("B constructor called");
    }
    @Override
    void m1() {
        System.out.println("m1");
    }
}
