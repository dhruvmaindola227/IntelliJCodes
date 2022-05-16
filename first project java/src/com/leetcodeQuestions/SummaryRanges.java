package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,6,7,10};
        System.out.println(summaryRanges(arr));
    }
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> al=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;

            if(start!=nums[i]){
                al.add(""+start+"->"+nums[i]);
            }
            else{
                al.add(""+start);
            }
        }
        return al;
    }
}
