package RandomTesting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodOverriding {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2));
        System.out.println(list);

    }

    public static String reverse(String s) {
       return new StringBuilder(s).reverse().toString();
    }

    public static String createString(char[] chars){
        StringBuilder s = new StringBuilder();
        for (char ch : chars){
            s.append(ch);
        }
        return s.toString();
    }
}