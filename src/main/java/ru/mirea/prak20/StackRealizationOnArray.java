package ru.mirea.prak20;

public class StackRealizationOnArray {
    private int[] array;
    private int capacity;
    private int top;

    public StackRealizationOnArray(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full :/");
            System.exit(1);
        }
        System.out.println("Inserting " + value + " into stack...");
        array[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty :/");
            System.exit(1);
        }
        System.out.println("Deleting " + array[top]);
        return array[top--];
    }

    public int getSize(){
        return top + 1;
    }

    public void print(){
        System.out.println("Stack: ");
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }



}
