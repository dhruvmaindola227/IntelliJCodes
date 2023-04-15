package Teaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionAttemp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(
                1,2,3,4,5,6,7,1,1,1,1,1,1
        ));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == 1)
                list.remove(list.get(i));
        }
        System.out.println(list);
    }
}
