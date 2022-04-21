package com.selfPractice;

class Outer {
     void m1() {
      class Inner {
             static void m2(int a) {
                System.out.println("hello " + a);
            }

        }
//        Inner i = new Inner();
        Inner.m2(3);
    }

    public static void main(String[] args) {
        Outer o=new Outer();
        o.m1();
    }

//    public static void main(String[] args) {
//        Outer o = new Outer(); //If we have declared m1() to be static then this is useless although not invalid.
//        o.m1(); //this is pointless BUT NOT INVALID BECAUSE WE ARE INSIDE THE OUTER CLASS.
////        m1(); /*Since we are creating the main method inside the outer class ,
////         we dont even need to create the object of the outer class(WHEN m1() is STATIC)
////         If m1 is not static then you obviously need to create the object of outer class*/
//    }
}

//class Test
//{
//    public static void main(String[] args) {
////        m1(); //Here even though the m1() is static , you cannot reference it without the object.
//        Outer o= new Outer();
//        o.m1(); //This is also useless since m1 is static but not invalid.
////        Outer.m1(); //This would be ideal since m1() is static.
//    }
//}

