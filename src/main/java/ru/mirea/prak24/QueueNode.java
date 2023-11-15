package ru.mirea.prak24;

public class QueueNode {
    private QueueNode next;
    private QueueNode prev;
    private Order value;

    public QueueNode(QueueNode prev, QueueNode next, Order value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public QueueNode getPrev() {
        return prev;
    }

    public void setPrev(QueueNode prev) {
        this.prev = prev;
    }

    public Order getValue() {
        return value;
    }

    public void setValue(Order value) {
        this.value = value;
    }
}
