package com.selfPractice;

public class RemoveAndPrintUniqueElements {
    public static void main(String[] args) {
        int[] arr= {5,5};
        int count = 0;
        int len=arr.length;
        for(int i = 0; i< arr.length-1 ; i++){
            for(int j= i+1 ; j< arr.length ; j++ ){
                if(arr[i] == arr[j] && j < arr.length - count){
                    int temp = arr[len-1-count];
                    arr[len-1-count]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }
        }
        for(int i=0;i<len-count-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
