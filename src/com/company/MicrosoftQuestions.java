package com.company;

import java.util.Stack;

public class MicrosoftQuestions {

    // Question 1 -- Evaluate Reverse Polish Notation
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for(String op : tokens){
            if(op.equals("+")){
                int a = stack.peek(); // 2
                stack.pop();
                int b = stack.peek(); // 3
                stack.pop();

                stack.push(a+b);
            }
            else if(op.equals("*")){
                int a = stack.peek(); // 2
                stack.pop();
                int b = stack.peek(); // 3
                stack.pop();

                stack.push(a*b);
            }
            else if(op.equals("-")){
                int a = stack.peek(); // 2
                stack.pop();
                int b = stack.peek(); // 3
                stack.pop();

                stack.push(b-a);
            }
            else if(op.equals("/")){
                int a = stack.peek(); // 2
                stack.pop();
                int b = stack.peek(); // 3
                stack.pop();

                stack.push(b/a);
            }
            else{
                int num = Integer.valueOf(op);
                stack.push(num);
            }
        }
        return stack.peek();
    }
}
