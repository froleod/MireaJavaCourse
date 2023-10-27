package ru.mirea.prak21.Task1;

public class ArrayQueue {
    private Object[] elements = new Object[10];
    private int size;
    private int head;
    private int tail;

    public void enqueue(Object item) {
        if (size == elements.length) {
            System.out.println("Queue is full");
        }
        elements[tail] = item;
        tail = (tail + 1) % elements.length;
        size++;
        System.out.println("Inserted: " + item);

    }

    public Object dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        Object item = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        System.out.println("Deleted: " + item);

        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

}
