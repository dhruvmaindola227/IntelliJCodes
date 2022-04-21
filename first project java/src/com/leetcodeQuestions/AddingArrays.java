package com.leetcodeQuestions;

import java.util.Arrays;

public class AddingArrays {
    public static void main(String[] args) {
        int [] a= {1,2,3};
        int [] aa= new int[2*a.length];
        int ind=0;

                for(int i=0;i<2;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                aa[ind]=a[j];
                ind++;
            }

        }
        System.out.println(Arrays.toString(aa));
        }
    }



