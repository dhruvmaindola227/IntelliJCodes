package com.leetcodeQuestions;

public class NumberOfStepsToReduceToZeroRecursion {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(44));
    }

        private static int count=0;
        public static int numberOfSteps(int num) {
            if(num==0)
                return 0;
            if(num%2==0){
                count++;
                numberOfSteps(num/2);
            }
            else{
                count++;
                numberOfSteps(num-1);
            }
            return count;
        }
    }

