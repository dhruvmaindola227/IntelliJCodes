package com.Stack;
//lmao
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private static int top = -1;
    private static char[] stack = new char[2000];
    public void push(char value){
        if(top > 9){
            throw new StackOverflowError();
        }
         stack[++top] = value;
    }

    public int pop(){
        if(top == -1){
            throw new EmptyStackException();
        }

        return stack[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int peek(){
        return stack[top];
    }

    public void display(){
        for (int i = top; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }

    public String infixToPostFix(String expression){
        int i = 0;
        StringBuilder postFixExpression = new StringBuilder();
        List<Character> chars = new ArrayList<>(List.of('+' , '-' , '/' , '*' , '^' , '(' , ')'));
        while(i < expression.length()) {
            if (!chars.contains(expression.charAt(i))){
                postFixExpression.append(expression.charAt(i));
                i++;
            }
            else if (top == -1 || stack[top] == '('){
                push(expression.charAt(i));
                i++;
            }
            else if(expression.charAt(i) == '('){
                push('(');
                i++;
            }
            else if(expression.charAt(i) == ')'){
                while(stack[top] != '('){
                    postFixExpression.append(pop());
                }
                pop();
            }

        }
        return postFixExpression.toString();
    }

    public static void main(String[] args) {
       String s ="Sdaseas";
       Stack s1 = new Stack();

    }
}
