package ru.mirea.prak14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{

    protected ConcurrentLinkedQueue<E> queue = new ConcurrentLinkedQueue<>();

    public WaitList() {
    }

    public WaitList(ConcurrentLinkedQueue<E> queue) {
        this.queue = queue;
    }

    @Override
    public void add(E element) {
        queue.add(element);
    }

    @Override
    public E remove() {
        return queue.remove();
    }

    @Override
    public boolean contains(E element) {
        return queue.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> element) {
        return queue.containsAll(element);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "queue=" + queue +
                '}';
    }
}
