package ru.mirea.prak24;

import java.util.LinkedList;
import java.util.Map;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Map<Integer, Order> getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
