package ru.mirea.prak24;

import java.util.LinkedList;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    LinkedList<Order> getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
