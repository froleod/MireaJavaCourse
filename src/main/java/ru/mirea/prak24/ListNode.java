package ru.mirea.prak24;

public class ListNode {
    private ListNode next;
    private MenuItem value;


    public ListNode(ListNode next, MenuItem value) {
        this.next = next;
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public MenuItem getValue() {
        return value;
    }

    public void setValue(MenuItem value) {
        this.value = value;
    }
}
