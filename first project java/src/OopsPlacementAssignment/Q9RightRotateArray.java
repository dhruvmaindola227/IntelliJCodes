package OopsPlacementAssignment;

import java.util.Arrays;

public class Q9RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("original array : " + Arrays.toString(arr));
        int numberOfTimesToRotate = 3;
//        rotate(arr , numberOfTimesToRotate);
          rotateMyWay(arr,numberOfTimesToRotate);
        System.out.println("Array after rotating "+numberOfTimesToRotate+" times : " +
                Arrays.toString(arr));

    }

    public static void reverse(int[] nums, int left, int right) { //Method made to reverse subarrays.
        //For example. [1,2,3,4,5,6,7] reverse (1,2,3,4) and (5,6,7)
        //in amongst themselves -> (4,3,2,1) and (7,6,5)
        //reverse the entire array now - > [5,6,8,1,2,3,4]
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[--right];
            nums[right] = temp;
        }
    }
    //method number 1.
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = (n == 0 ? 0 : k % n);  //k%n is for cases where k>n
        reverse(nums, 0    , n - k);  //reversing 1,2,3,4
        reverse(nums, n - k, n    );   //reversing 5,6,7
        reverse(nums, 0    , n    );   //reversing 4321765
    }
    //method number 2
    public static int[] rotateNormal(int[] nums , int k) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[(i + k) % arr.length] = nums[i];
        }
        return arr;
    }
    //method number 3
    public static void rotateMyWay(int[] nums , int k){
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length-1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }

}
