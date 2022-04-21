package com.leetcodeQuestions;

public class MaxSizeSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr= {2,4,0,1,1,5,7};
        int sum=2;
        System.out.println(maxSizeSubArray(arr,sum));
    }

    public static int maxSizeSubArray(int[] arr, int sum){
        int ptr=0;
        int fptr=0;
        int cursum=0;
        int maxlen=0;
        while(ptr<arr.length){
            if(cursum==0)
            {
                fptr=ptr;

            }
            cursum+=arr[ptr];
        }
        return maxlen;
    }
}
