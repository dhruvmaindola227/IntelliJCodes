package com.selfPractice;

public class WrapperClassesPractise {
    public static void main(String[] args) {
        System.out.println(printElement(5,1,2,3,4,5,6,7,8,9,10));
    }   //VarArgs are stored internally as an array inside the function.
   static int printElement(int index, int... elementToPrint){
//        int[] arr= elementToPrint;
        return elementToPrint[0];
   }
}
