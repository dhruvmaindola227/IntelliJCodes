package CompanyQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class BigOhNumsFirstNumsSecond {
    public static void main(String[] args) {
        int[] numsFirst = {3,4,10};
        int[] numsSecond = {1,4,8};
        int target = 5;
        System.out.println(Arrays.toString(twoSumInTwoArrays(numsFirst, numsSecond, 5)));
    }

    public static int[] twoSumInTwoArrays(int[] numsFirst , int[] numsSecond , int target){
        HashMap<Integer ,Integer> map = new HashMap<>();
        for (int i = 0; i < numsSecond.length; i++) {
            map.put(numsSecond[i] , i);
        }//creating a set of numbers in the second array

        for (int i = 0; i < numsFirst.length; i++) {
            if(map.containsKey(numsFirst[i] + target)){
                return new int[]{i , map.get(numsFirst[i] + target)};
            }
        }
        return new int[]{-1,-1};
    }
}
