package com.selfPractice;


    // Method overriding.
    public class DontKnow {
        public static void main(String[] args) {
            B object = new B(1, 2, 3);
            object.show();
            object.show(5);
        }
    }
    class A {
        int i, j;
        A(int a, int b) {
            i = a;
            j = b;
        }
        // display i and j
        void show() {
            System.out.println("i and j: " + i + " " + j);
        }
        void show(double a)
        {
            System.out.println(a);
        }
    }

    class B extends A {
        int k;
        B(int a, int b, int c) {
            super(a ,b);
            k = c;
            // display k -- this overrides show() in A
        }
        void show(double a)
            {   super.show();
                super.show(a);
                System.out.println(" "+ a+i+j);
        }
        void show() {
            System.out.println("k: " + k);
        }

    }
//public class DontKnow {
//    public static void main(String[] args) {
//        B object = new B(1, 2, 3);
//        object.show(); // this calls show() in B
//    }

