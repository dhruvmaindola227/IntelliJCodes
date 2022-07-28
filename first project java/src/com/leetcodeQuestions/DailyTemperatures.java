package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<ArrayList<Integer>> stack = new Stack<>();

        int[] answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            boolean flag = false;
            if(stack.isEmpty()){
                stack.push(new ArrayList<>(Arrays.asList(temperatures[i] , i)));
            }
            else if(temperatures[i] < stack.peek().get(0)){
                stack.push(new ArrayList<>(Arrays.asList(temperatures[i] , i)));
            }
            while(!stack.isEmpty() && temperatures[i] > stack.peek().get(0)){
                answer[stack.peek().get(1)] = i - stack.peek().get(1);
                stack.pop();
                flag = true;
            }
                stack.push(new ArrayList<>(Arrays.asList(temperatures[i] , i)));
        }
        return answer;
    }
}
