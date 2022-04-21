package javaAssignmentMCA;

public class Q1 {
    public static void main(String[] args) {
        // 1. If statements.
        System.out.println("If statements.");
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }
        // 2. Switch statements.
        System.out.println("Switch statements.");
        int cases = 10;
        switch (cases) {
            case 10:
                System.out.println("a is 10");
                break;
            case 20:
                System.out.println("a is 20");
                break;
            default:
                System.out.println("a is not 10 or 20");
        }
        System.out.println("For Loop.");
        for (int i = 0; i < 4; i++) {
            System.out.println("i is " + i);
        }
        System.out.println("While Loop.");
        int i = 0;
        while (i < 4) {
            System.out.println("i is " + i);
            i++;
        }
        System.out.println("Do While Loop");
        int ct = 0;
        do {
            System.out.println("i is " + ct);
            ct++;
        } while (ct < 4);
    }
}

