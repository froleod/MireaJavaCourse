package ru.mirea.prak20;

import java.util.Scanner;
import java.util.Stack;

public class ReversedPolishNotation {

    public static int RPN(String rpn) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < rpn.length(); i++) {
            char c = rpn.charAt(i);
            if (c != ' ') {
//                System.out.println(c);
                if (Character.isDigit(c)) {
                    stack.push(Integer.parseInt(String.valueOf(c)));
                } else if (c == '*') {
                    if (!stack.isEmpty() && stack.size() >= 2) {
                        int num1 = stack.pop();
                        int num2 = stack.pop();
                        stack.push(num2 * num1);
                    } else {
                        System.out.println("Invalid syntax :/");
                        System.exit(1);
                    }
                } else if (c == '+') {
                    if (!stack.isEmpty() && stack.size() >= 2) {
                        int num1 = stack.pop();
                        int num2 = stack.pop();
//                        System.out.println(num1 + " " + num2);
                        stack.push(num2 + num1);
                    } else {
                        System.out.println("Invalid syntax :/");
                        System.exit(1);
                    }
                } else if (c == '-') {
                    if (!stack.isEmpty() && stack.size() >= 2) {
                        int num1 = stack.pop();
//                        System.out.println(num1);
                        int num2 = stack.pop();
//                        System.out.println(num2);
                        stack.push(num2 - num1);
                    } else {
                        throw new IllegalArgumentException("Invalid syntax :/");
                    }
                } else if (c == '/') {
                    if (!stack.isEmpty() && stack.size() >= 2) {
                        int num1 = stack.pop();
                        int num2 = stack.pop();
                        try {
                            stack.push(num2 / num1);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                            System.exit(1);
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid syntax :/");
                    }
//                    System.out.println(stack.peek());
                } else {
                    throw new IllegalArgumentException("Invalid syntax :/");
                }
            }
        }

        if (!stack.empty()) {
            return stack.pop();
        }
        return -1;
    }

}
