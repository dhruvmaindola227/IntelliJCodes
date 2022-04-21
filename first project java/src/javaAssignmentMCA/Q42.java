package javaAssignmentMCA;
//Write a java program to prove that strings are immutable in java?
public class Q42 {

    public static void main(String[] args) {
        testmethod();
    }

    private static void testmethod() {
        String a = "Some String";
        System.out.println("a 1-->" + a);
        System.out.println("a 1 address-->" + a.hashCode());

        a = "New String but same variable";
        System.out.println("a 2-->" + a);

        System.out.println("a 2 address-->" + a.hashCode());
    }

}

