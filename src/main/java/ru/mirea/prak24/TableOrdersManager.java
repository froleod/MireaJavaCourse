package ru.mirea.prak24;

import java.util.*;

public class TableOrdersManager implements OrdersManager {
    Map<Integer, Order> orders;
    int tablesCount;

    public TableOrdersManager(int tablesCount) {
        orders = new HashMap<>();
        this.tablesCount = tablesCount;
    }

    public void add(Order order, int tableNumber) {
        if (!orders.containsKey(tableNumber))
            orders.put(tableNumber, order);
        else
            throw new IllegalArgumentException("Стол с этим номером уже занят");
    }

    public void addItem(MenuItem item, int tableNumber) {
        if (orders.containsKey(tableNumber))
            orders.get(tableNumber).add(item);
        else
            throw new IllegalArgumentException("Стола с этим номером нет");
    }

    public int freeTableNumber() {
        for (int i = 1; i <= tablesCount; i++) {
            if (!orders.containsKey(i))
                return i;
        }
        return -1;
    }

    public ArrayList<Integer> freeTablesNumbers() {
        ArrayList<Integer> freeTables = new ArrayList<>();
        for (int i = 1; i <= tablesCount; i++) {
            if (!orders.containsKey(i))
                freeTables.add(i);
        }
        return freeTables;
    }


    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (int key : orders.keySet())
            count += orders.get(key).itemQuantity(itemName);

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for (int key : orders.keySet())
            count += orders.get(key).itemQuantity(item);

        return count;
    }

    @Override
    public Map<Integer, Order> getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int sum = 0;
        for (int key : orders.keySet())
            sum += orders.get(key).costTotal();
        return sum;
    }

    @Override
    public int ordersQuantity() {
        return orders.size();
    }

    @Override
    public String toString() {
        return "TableOrdersManager{" +
                "orders=" + orders +
                ", tablesCount=" + tablesCount +
                '}';
    }
}
