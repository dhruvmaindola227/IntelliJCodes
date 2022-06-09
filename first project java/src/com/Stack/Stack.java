package com.Stack;
//lmao
import java.util.*;

public class Stack {
     static int top = -1;
     static char[] stack = new char[2000];
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
        Map<Character , Integer> precedence = new HashMap<>();
        precedence.put('^' , 3);
        precedence.put('*' , 2);
        precedence.put('/' , 2);
        precedence.put('+' , 1);
        precedence.put('-' , 1);
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
//                do{
//                    postFixExpression.append((char)pop());
//                } while(stack[top] != '(');
                while (stack[top] != '('){
                    postFixExpression.append((char)pop());
                }
                pop();
                i++;
            }
            else if(precedence.get(expression.charAt(i)) > precedence.get(stack[top])){
                push(expression.charAt(i));
                i++;
            }
            else if(precedence.get(expression.charAt(i)) < precedence.get(stack[top])){
                postFixExpression.append((char)pop());

            }
            else if(precedence.get(expression.charAt(i)) == precedence.get(stack[top])){
                if (stack[top] != '^') {
                    postFixExpression.append((char) pop());
                }
                push(expression.charAt(i));
                i++;
            }

        }
        do{
            postFixExpression.append((char)pop());
        }while (top != -1);
        return postFixExpression.toString();
    }

    public static void main(String[] args) {
       String s ="A+B*C/(E-F)";
       Stack s1 = new Stack();
        System.out.println(s1.infixToPostFix(s));
    }
}
