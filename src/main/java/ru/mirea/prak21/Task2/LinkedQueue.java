package ru.mirea.prak21.Task2;

import java.util.LinkedList;

public class LinkedQueue<E> implements Queue<E>{
    LinkedList<E> queue;

    public LinkedQueue() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void add(E element) {
        queue.add(element);
        System.out.println("Inserted: " + element);
    }

    @Override
    public E peek() {
        return queue.peek();
    }

    @Override
    public E poll() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                "queue=" + queue +
                '}';
    }
}
