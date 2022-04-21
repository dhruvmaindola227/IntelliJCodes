package com.selfPractice;

class LetsSee {
void m1(){
    System.out.println("m1 of parent class");
}
void m2(){
    System.out.println("m2 of parent class");
}
}

class Child extends LetsSee{
    @Override
    void m1() {
        System.out.println("m1 of child");
    }

    @Override
    void m2() {
        System.out.println("m2 of child");
    }
}

class Trial3 {
    public static void main(String[] args) {
//        Child ls = new LetsSee(); //cannot do this.
    }
}
