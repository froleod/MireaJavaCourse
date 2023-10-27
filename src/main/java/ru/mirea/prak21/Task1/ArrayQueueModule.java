package ru.mirea.prak21.Task1;

public class ArrayQueueModule {
    private static Object[] elements = new Object[5];
    private static int size;
    private static int head;
    private static int tail;

    public static void enqueue(Object item) {
        if (size == elements.length)
            System.out.println("Queue is full :(");
        else {
            elements[tail] = item;
            tail = (tail + 1) % elements.length;
            size++;
            System.out.println("Inserted: " + item);
        }
    }

    public static Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty :(");
            return -1;
        } else {
            Object item = elements[head];

            elements[head] = null;
            head = (head + 1) % elements.length;
            size--;
            System.out.println(item + " deleted");

            return item;
        }
    }

    public static Object element() {
        if (isEmpty()) {
            System.out.println("Queue is empty :(");
            return -1;
        } else {
            return elements[head];
        }
    }

    public static int size() {
        return size;
    }

    public static void clear() {
        elements = new Object[5];
        size = 0;
        head = 0;
        tail = 0;
    }

    static boolean isEmpty() {
        return size == 0;
    }


}
