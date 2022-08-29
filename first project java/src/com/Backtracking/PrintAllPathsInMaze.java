package com.Backtracking;

public class PrintAllPathsInMaze {
    public static void main(String[] args) {
        printPaths(5,4 , "");
    }

    public static void printPaths(int r, int c , String p) {
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1) {
            printPaths(r - 1, c, p + 'D');
        }

        if(c > 1) {
            printPaths(r, c - 1, p + 'R');
        }
        }

}
