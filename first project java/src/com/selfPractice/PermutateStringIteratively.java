package com.selfPractice;

import java.util.ArrayList;
import java.util.List;
//did not understand what is happening.....
public class PermutateStringIteratively {
    public static void main(String[] args) {
        List<List<Integer>> ans = permutateString(new int[]{1,2,3});
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> permutateString(int[] arr) {
         List<List<Integer>> outer = new ArrayList<>();
         outer.add(new ArrayList<>());
         for(int nums : arr){
             int n = outer.size();
             for(int i=0;i<n;i++){
                 List<Integer> internal = new ArrayList<>(outer.get(i));
                 internal.add(nums);
                 outer.add(internal);
             }
         }
         return outer;
    }
}
