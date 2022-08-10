package RandomTesting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
    public static void rotate(int[][] matrix) {
        int[][] arr=new int[matrix.length][matrix[0].length];
        int i1=-1;
        int i2=0;
        for(int i=0;i<matrix.length;i++){
            i1++;
            i2=0;
            for(int j=matrix[0].length-1;j>=0;j--){
                arr[i1][i2]=matrix[j][i];
                i2++;
            }
        }
        matrix = arr;
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(arr));
    }



    }

