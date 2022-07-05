package RandomTesting;

import java.util.Arrays;

public class SortByParityII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int oddIx = 1, evenIx = 0;
        while(oddIx < nums.length && evenIx < nums.length){
            if (nums[oddIx] % 2 < nums[evenIx] % 2){
                nums[oddIx] = nums[oddIx] + nums[evenIx]; //swapping without third variable.
                nums[evenIx] = nums[oddIx] - nums[evenIx];
                nums[oddIx] = nums[oddIx] - nums[evenIx];
            }
            if (nums[oddIx] % 2 == 1)
                oddIx = oddIx + 2;
            if (nums[evenIx] % 2 == 0)
                evenIx = evenIx + 2;
        }
        return nums;
    }

}
