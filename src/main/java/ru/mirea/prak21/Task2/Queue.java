package ru.mirea.prak21.Task2;

public interface Queue<E> {
    void add(E element);
    E peek();
    E poll();
    boolean isEmpty();
}
