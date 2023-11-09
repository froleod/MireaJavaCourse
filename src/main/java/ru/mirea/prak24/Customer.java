package ru.mirea.prak24;

import java.util.LinkedList;

public final class Customer implements Order{
    private String firstName;
    private String secondName;
    private int age;
    private Address address;

    private Customer MATURE_UNKNOWN_CUSTOMER;
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean add(MenuItem item) {
        return false;
    }

    @Override
    public String[] itemNames() {
        return new String[0];
    }

    @Override
    public int itemsQuantity() {
        return 0;
    }

    @Override
    public int itemQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return 0;
    }

    @Override
    public LinkedList<MenuItem> getItems() {
        return null;
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {
        return 0;
    }

    @Override
    public LinkedList<MenuItem> sortedItemsByCostDesc() {
        return null;
    }

    @Override
    public int costTotal() {
        return 0;
    }

    @Override
    public Customer getCustomer() {
        return MATURE_UNKNOWN_CUSTOMER;
    }

    @Override
    public void setCustomer(Customer customer) {
        MATURE_UNKNOWN_CUSTOMER = customer;
    }
}
