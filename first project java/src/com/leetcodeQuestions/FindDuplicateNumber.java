package com.leetcodeQuestions;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,1};
        System.out.println(findDuplicate(arr));
    } //ONLY WORK WHEN INPUT ARRAY HAS EXACTLY ONE ELEMENT THAT APPEARS EXACTLY TWICE
      //AND THE INPUT IS FROM [1,N].
    public static int findDuplicate(int[] nums) {
        int sumOfArr = 0;
        for(int i = 0; i<nums.length; i++){
            sumOfArr+=nums[i];
        }
        int sumOfN=nums.length*(nums.length+1)/2;
        return nums.length-(sumOfN-sumOfArr);
    }
}
