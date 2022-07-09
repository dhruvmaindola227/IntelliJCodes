package com.Stack;
//lmao
import java.util.*;

public class Stack {
     static int top = -1;
     static Object[] stack = new Object[2000];
     static private final List<Character> chars = new ArrayList<>(List.of('+' , '-' , '/' , '*' , '^' , '(' , ')'));
    public <T> void push(T value){
        if(top > 1999){
            throw new StackOverflowError();
        }
         stack[++top] = value;
    }

    public <T> Object pop(){
        if(top == -1){
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public <T> Object peek(){
        return stack[top];
    }

    public void display(){
        for (int i = top; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }
    public int evaluatePostfix(String expression){
        int i = 0;
        int result = 0;
        List<Character> chars = new ArrayList<>(List.of('+' , '-' , '/' , '*' , '^' , '(' , ')'));
        while(i < expression.length()){
            if(!chars.contains(expression.charAt(i))){
                push(expression.charAt(i));
            }else{
                result = performOperation(expression.charAt(i));
                push(result);
            }
            i++;
        }
        return (int)pop();
    }

    private int performOperation(char operator) {
        int operand1 = Integer.parseInt(String.valueOf(pop()));
        System.out.println("op1 -> "+ operand1);
        int operand2 = Integer.parseInt(String.valueOf(pop()));
        System.out.println("op2 -> "+ operand2);
        int ans = 0;

        switch (operator) {
            case '^' -> {
                ans =operand2 ^ operand1;
            }
            case '*' -> {
                ans = operand2 * operand1;
            }
            case '/' -> {
                ans = operand2 / operand1;
            }
            case '+' -> {
                ans = operand2 + operand1;
            }
            case '-' -> {
                ans = operand2 - operand1;
            }
        }
//        System.out.println("ans ->" + ans);
        return ans;
    }

    public String infixToPostFix(String expression){
        int i = 0;
        StringBuilder postFixExpression = new StringBuilder();
//        List<Character> chars = new ArrayList<>(List.of('+' , '-' , '/' , '*' , '^' , '(' , ')'));
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
            else if (top == -1 || stack[top].equals('(')){
                push(expression.charAt(i));
                i++;
            }
            else if(expression.charAt(i) == '('){
                push('(');
                i++;
            }
            else if(expression.charAt(i) == ')'){
                while (!stack[top].equals('(')){
                    postFixExpression.append((char)pop());
                }
                pop();
                i++;
            }
            else if(precedence.get(expression.charAt(i)) > precedence.get((char)stack[top])){
                push(expression.charAt(i));
                i++;
            }
            else if(precedence.get(expression.charAt(i)) < precedence.get((char)stack[top])){
                postFixExpression.append((char)pop());

            }
            else if(Objects.equals(precedence.get(expression.charAt(i)), precedence.get((char) stack[top]))){
                if (!stack[top].equals('^')) {
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
       String s ="a+b*(c^d-e)^(f+g*h)-i";
       Stack s1 = new Stack();
//        System.out.println(s1.infixToPostFix(s));
        System.out.println(s1.evaluatePostfix("21+3*"));
    }
}
