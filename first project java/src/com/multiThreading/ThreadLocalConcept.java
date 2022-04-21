package com.multiThreading;

public class ThreadLocalConcept {
    public static void main(String[] args) {

        ThreadLocal<String> tl= new ThreadLocal(){ //this is an anonymous inner class which is extending the ThreadLocal class
                                                   //and we are overriding the initialValue() method of it because we dont want
                                                   //the initial value to be null.
            @Override
            protected Object initialValue() {
                return "Dhruv";
            }
        };
        System.out.println(tl.get()); //initially internally it will always be null unless the intialValue() is overridden.
        tl.set("Namste");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }
}
