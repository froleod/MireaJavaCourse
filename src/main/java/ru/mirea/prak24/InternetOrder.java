package ru.mirea.prak24;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;

public class InternetOrder implements Order {
    private int size;
    private ListNode head;
    private ListNode tail;
    private Customer customer;

    public InternetOrder(int size, ListNode head, ListNode tail) {
        this.size = size;
        this.head = head;
        this.tail = tail;
    }

    @Override
    public boolean add(MenuItem item) {
        ListNode newNode = new ListNode(null, item);
        head.setNext(newNode);
        head = newNode;
        size++;
        return true;
    }

    @Override
    public LinkedList<String> itemNames() {
        LinkedList<String> names = new LinkedList<>();
        ListNode node = head;
        while (node.getNext() != null) {
            names.add(node.getValue().getName());
            node = node.getNext();
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        ListNode node = head;
        while (node.getNext() != null) {
            if (Objects.equals(itemName, node.getValue().getName())) {
                count++;
                node = node.getNext();
            }
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int count = 0;
        ListNode node = head;
        while (node.getNext() != null) {
            if (Objects.equals(itemName, node.getValue())) {
                count++;
                node = node.getNext();
            }
        }
        return count;
    }

    @Override
    public LinkedList<MenuItem> getItems() {
        LinkedList<MenuItem> items = new LinkedList<>();
        ListNode node = head;
        while (node.getNext() != null) {
            items.add(node.getValue());
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode node = head;
        while (node.getNext() != null) {
            if(Objects.equals(node.getNext().getValue().getName(), itemName)){
                node.getNext().setValue(node.getNext().getNext().getValue());
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode node = head;
        while (node.getNext() != null) {
            if(Objects.equals(node.getNext().getValue(), item)){
                node.getNext().setValue(node.getNext().getNext().getValue());
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        ListNode node = head;
        while (node.getNext() != null) {
            if(Objects.equals(node.getNext().getValue().getName(), itemName)){
                node.getNext().setValue(node.getNext().getNext().getValue());
                size--;
            }
        }
        return size;
    }

    @Override
    public int removeAll(MenuItem item) {
        ListNode node = head;
        while (node.getNext() != null) {
            if(Objects.equals(node.getNext().getValue(), item)){
                node.getNext().setValue(node.getNext().getNext().getValue());
                size--;
            }
        }
        return size;
    }

    @Override
    public LinkedList<MenuItem> sortedItemsByCostDesc() {
        LinkedList<MenuItem> sortedMenuItems = getItems();
        sortedMenuItems.sort(new Comparator<MenuItem>() {
            @Override
            public int compare(MenuItem o1, MenuItem o2) {
                return o2.getCost() - o1.getCost();
            }
        });
        return sortedMenuItems;
    }

    @Override
    public int costTotal() {
        LinkedList<MenuItem> items = getItems();
        return items.stream().mapToInt(MenuItem::getCost).sum();
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "InternetOrder{" +
                "size=" + size +
                ", head=" + head +
                ", tail=" + tail +
                ", customer=" + customer +
                '}';
    }
}
