package RandomTesting;

import java.util.ArrayList;
import java.util.Arrays;

public class StringImmutability {
    public static void main(String[] args) {
        int a = 10;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                5,2,2,3,4,5,5
        ));
        System.out.println(list.get(0).compareTo(5));
        System.out.println(list.get(0).compareTo(6));
        System.out.println(list.get(0).compareTo(3));


//        String c = b;
//
//        System.out.println(a == c);
//        System.out.println(a.equals(c));
//
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//
//        System.out.println(b == c);
//        System.out.println(b.equals(c));
    }
}

