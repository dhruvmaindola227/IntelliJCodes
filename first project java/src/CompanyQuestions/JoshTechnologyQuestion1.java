package CompanyQuestions;

import java.util.HashMap;

public class JoshTechnologyQuestion1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(subArraySum(arr , k));
    }
    public static int subArraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<> ();
        map.put(0, 1);  //base case.

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }//
}
