package ru.mirea.prak24;

import java.util.LinkedList;
import java.util.Map;

public class InternetOrdersManager implements OrdersManager{
    private QueueNode head;
    private QueueNode tail;
    private int size;

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Map<Integer, Order> getOrders() {
        return null;
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }

    public boolean add(Order order) {
        QueueNode newNode = new QueueNode(tail, null, order);
        tail.setNext(newNode);
        tail = newNode;
        return true;
    }

    public Order remove() {
        Order firstOrder = head.getValue();
        head = head.getNext();
        head.setPrev(null);
        return firstOrder;

    }

    Order order() {
        return head.getValue();
    };
}
