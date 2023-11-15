package ru.mirea.prak24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;

public class TableOrder implements Order{
    private int size = 0;
    private LinkedList<MenuItem> menuItems;
    private Customer customer;


    public TableOrder() {
        this.menuItems = new LinkedList<>();
    }

    @Override
    public boolean add(MenuItem item) {
        menuItems.add(item);
        size++;
        return true;
    }

    @Override
    public LinkedList<String> itemNames() {
        LinkedList<String> names = new LinkedList<>();
        for(MenuItem item: menuItems)
            names.add(item.getName());
        return names;
    }

    @Override
    public int itemsQuantity() {
        return menuItems.size();
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for(int i = 0; i < menuItems.size(); i++)
            if(Objects.equals(menuItems.get(i).getName(), itemName))
                count++;
        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int count = 0;
        for (MenuItem menuItem : menuItems)
            if (Objects.equals(menuItem.getName(), itemName.getName()))
                count++;
        return count;
    }

    @Override
    public LinkedList<MenuItem> getItems() {
        return menuItems;
    }

    @Override
    public boolean remove(String itemName) {
        for(MenuItem menuItem: menuItems)
            if(Objects.equals(menuItem.getName(), itemName)) {
                size--;
                return menuItems.remove(menuItem);
            }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        size--;
        return menuItems.remove(item);
    }

    @Override
    public int removeAll(String itemName) {
        int countOfRemoved = 0;
        for(MenuItem item: menuItems){
            if(Objects.equals(item.getName(), itemName)) {
                size--;
                menuItems.remove(item);
                countOfRemoved++;
            }
        }
        return countOfRemoved;
    }

    @Override
    public int removeAll(MenuItem item) {
        int countOfRemoved = 0;
        for(MenuItem menuitem: menuItems){
            if(Objects.equals(menuitem, item)) {
                size--;
                menuItems.remove(item);
                countOfRemoved++;
            }
        }
        return countOfRemoved;
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
        return menuItems.stream().mapToInt(MenuItem::getCost).sum();
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
        return "TableOrder{" +
                "size=" + size +
                ", menuItems=" + menuItems +
                ", customer=" + customer +
                '}';
    }
}
