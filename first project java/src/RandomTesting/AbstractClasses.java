package RandomTesting;

public class AbstractClasses implements I2,I1{
    public static void main(String[] args) {
        B ref = new B();
        ref.m1();
        ref.m2();
        AbstractClasses ab = new AbstractClasses();
        A.m3();
        I1 i1 = () -> System.out.println("In I1 m1");
        I2 i2 = () -> System.out.println("In I2 m1");
        i1.m1();
        i2.m1();
    }

    public void m1(){
        System.out.println("In m1");
    }
}
//no argument constructor of the parent class will always be called by the compiler.
abstract class A {

    public static void m3(){
        System.out.println("m3");
    }

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

interface I1{
    void m1();
}

interface I2{
    void m1();
}

