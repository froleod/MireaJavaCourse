package ru.mirea.prak24;

import java.util.LinkedList;

public interface Order {
    boolean add(MenuItem item);
    String[] itemNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem itemName);
    LinkedList<MenuItem> getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem item);

    LinkedList<MenuItem> sortedItemsByCostDesc();

    int costTotal();

    Customer getCustomer();

    void setCustomer(Customer customer);

}
