package ru.mirea.prak21;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueModuleTest {


    
    //TODO: Найдите инвариант структуры данных «очередь». Определите функции,
    //которые необходимы для реализации очереди. Найдите их пред- и
    //постусловия.
    ArrayQueueModule queue = new ArrayQueueModule();
    @Before
    public void setUp() throws Exception {
        queue.enqueue(5);
        queue.enqueue(99);
        queue.enqueue(17);
        queue.enqueue(23);
    }

    @Test
    public void isFull() {
        assertEquals(false, queue.isFull());
    }

    @Test
    public void enqueue() {
        queue.enqueue(10);
        assertEquals(5, queue.size());
    }

    @Test
    public void dequeue() {
        assertEquals(5, queue.dequeue());
    }

    @Test
    public void element() {
        queue.dequeue();
        assertEquals(99, queue.element());
    }

    @Test
    public void size() {
        assertEquals(4, queue.size());
    }


    @Test
    public void isEmpty() {
        queue.clear();
        assertEquals(true, queue.isEmpty());
    }
}