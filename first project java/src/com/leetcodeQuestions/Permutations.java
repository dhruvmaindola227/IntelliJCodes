package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permutate(arr));
    }


    public static ArrayList<ArrayList<Integer>> permutate(int[] arr) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        if(arr.length == 1){
            answer.add(new ArrayList<>());
            answer.get(0).add(0,arr[0]);
            return answer;
        }
        int[] merged = new int[arr.length-1];
        int k = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            k=0;
            j=0;
            while (k < arr.length && j < merged.length){
                if(i!=k){
                    merged[j]=arr[k];
                    k++;
                    j++;
                }
                else{
                    k++;
                }
            }
           temp = permutate(merged);
            for(int in = 0 ; in < temp.size() ; in++){
               temp.get(in).add(0,arr[i]);
               answer.add(temp.get(in));
            }

            System.out.println(answer);
        }

        return answer;
    }
}
