package RandomTesting;

import java.util.ArrayList;
import java.util.Arrays;

public class MyRandom {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        Arrays.fill(lis , 1);
        for (int i = nums.length - 1; i >=0 ; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    lis[i] = Math.max(lis[i] , 1 + lis[j]);
                }
            }
        }
        return Arrays.stream(lis).max().orElse(0);
    }

}

