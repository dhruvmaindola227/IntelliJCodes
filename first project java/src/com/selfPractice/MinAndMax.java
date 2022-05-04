package com.selfPractice;
//JO SABSE LARGEST NUMBER HAI USKE ALAVA JO SABSE BADHA NUMBER MILEY VO HI PAKDADO.
public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        //first finding the max number and the position it is at.
        int maxNum = 0;
        int maxNumIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxNumIndex = i;
            }
        }//at the end of this loop. we will have max = 5 and maxindex = 0;
        //we will reset maxNum as 0 because what we are doing is that we are
        //running the same drill that is , finding the maximum number in the array
        //except , this time we will skip the number if it is at the index of
        //maxNumIndex(jiska matlab hai ki jahan par bhi mujhe max mila tha
        // vahan par ignore maardo aur aage badho.)
        maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum && i != maxNumIndex) {
                maxNum = arr[i];
                maxNumIndex = i;
            }
            //at the end of this we will get the second largest number.
        }
        System.out.println(maxNum);

//    public static int smallestNum(int[] arr) {
//        int min = 6;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }//end of for loop
//        //we will have the max element.
//        return min;
//    }
//
//    public static int largestNum(int[] arr) {
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }//end of for loop
//        //we will have the max element.
//        return max;
//    }
    }
}
