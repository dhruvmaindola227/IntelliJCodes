package com.mathRelated;

public class FindSqrtBinarySearch {
    public static void main(String[] args) {
        int num=40;
        int precisionVal=2;
        System.out.printf("%.3f" , sqrt(num,precisionVal)); //pretty printing
    }
//COMPLEXITY IS O(logN)
     static double sqrt(int num, int precisionVal) {
        int s=0;
        int e=num;
        double root=0.0;
        while(s<e){
         int mid=s+(e-s)/2;
         if(mid*mid==num)
             return num;
         if(mid*mid>num)
             e=mid-1;
         else s=mid+1;
        }
        double incr=0.1;
         for (int i = 0; i <= precisionVal; i++) {
             while(root*root<num){
                 root+=incr;
             }
             root-=incr;
             incr=incr/10;
         }
        return root;
    }
}
