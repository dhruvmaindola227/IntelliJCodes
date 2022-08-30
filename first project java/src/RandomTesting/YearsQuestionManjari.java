package RandomTesting;

import java.util.Scanner;

public class YearsQuestionManjari {
    public static void main(String[] args) {

        int s = 100;
        int ans = s%100 == 0 ? s / 100 : (s/100) + 1;
        System.out.println(ans);
    }
}
