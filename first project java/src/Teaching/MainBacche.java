package Teaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainBacche {
    public static void main(String[] args) {
        Bacche aayush = new Bacche(21 , "aayush" , "m");
        Bacche aashray = new Bacche(23 , "aashray" , "m");
        Bacche chirag = new Bacche(22 , "chirag" , "m");
        ArrayList<Bacche> baches = new ArrayList<>(Arrays.asList(
                aashray , aayush , chirag
        ));
        Collections.sort(baches);
        System.out.println(baches);
    }
}
