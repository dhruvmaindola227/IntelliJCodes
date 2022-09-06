package CompanyQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class BigOhBuddies {
    public static void main(String[] args) {
        int[] employeeCodes = {100,23,543,12,53,12,43,56};
        int hrNumber = 156;
        if(twoBuddies(employeeCodes,hrNumber)[0] == -1){
            System.out.println("Nobody found");
        }
        System.out.println(Arrays.toString(twoBuddies(employeeCodes , hrNumber)));
    }

    public static int[] twoBuddies(int[] employeeCodes, int hrNumber) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < employeeCodes.length; i++){
            if(map.containsKey(hrNumber - employeeCodes[i]))
                return new int[] {hrNumber - employeeCodes[i],employeeCodes[i]};
            else map.put(employeeCodes[i], i);
        }
        return new int[]{-1,-1};
    }

}
