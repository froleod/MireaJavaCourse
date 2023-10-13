package ru.mirea.prak20;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        StackRealizationOnArray stack = new StackRealizationOnArray(5);

        stack.push(15);
        stack.push(5);
        stack.push(-52);

        System.out.println(stack.getSize());

        stack.push(79);
        stack.push(312);

        stack.pop();

//        stack.push(1222);

        stack.print();
    }
}
