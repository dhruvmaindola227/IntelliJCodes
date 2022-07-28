package com.leetcodeQuestions;

import java.util.Stack;

public class evaluatePostfixLeetcode {
    public static void main(String[] args) {
        String[] strings = {"2","1","+","3","*"};
        System.out.println(evalRPN(strings));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int first = 0;
        int second = 0;
        for(int i = 0 ; i < tokens.length ; i++){
            char operation = tokens[i].charAt(0);
            if(operation == '+'){
                first = stack.pop();
                second = stack.pop();
                stack.push(second + first);
            }else if (operation == '-'){
                first = stack.pop();
                second = stack.pop();
                stack.push(second - first);
            }else if(operation == '*'){
                first = stack.pop();
                second = stack.pop();
                stack.push(second * first);
            }else if(operation == '/'){
                first = stack.pop();
                second = stack.pop();
                stack.push(second / first);
            }else{
                stack.add(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }


}

