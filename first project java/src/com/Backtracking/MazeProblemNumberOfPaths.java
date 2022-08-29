package com.Backtracking;

public class MazeProblemNumberOfPaths {
    public static void main(String[] args) {
        System.out.println(countNumberOfWays(15,1));
    }

    public static int countNumberOfWays(int row , int col) {

        if(row == 1 || col == 1){
            return 1; //only one way to go...
        }
        int moveDownCount = countNumberOfWays(row - 1, col);
        int moveRightCount = countNumberOfWays(row , col - 1);

        return moveDownCount + moveRightCount;

    }
}
