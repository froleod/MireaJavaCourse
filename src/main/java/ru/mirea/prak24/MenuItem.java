package ru.mirea.prak24;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;

public class MenuItem implements Order {

    private LinkedList<MenuItem> menuItems;

    private int cost;
    private String name;
    private String description;

    public int getCost(){
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean add(MenuItem item) {
        menuItems.add(item);
        return true;
    }

    @Override
    public String[] itemNames() {
        String[] strings = new String[menuItems.size()];
        for(int i = 0; i < menuItems.size(); i++)
            strings[i] = menuItems.get(i).getName();
        return strings;
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
            if(Objects.equals(menuItem.getName(), itemName))
                return menuItem.remove(menuItem);
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return menuItems.remove(item);
    }

    @Override
    public int removeAll(String itemName) {
        int countOfRemoved = 0;
        for(MenuItem item: menuItems){
            if(Objects.equals(item.getName(), itemName)) {
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
//        int totalCost = 0;
//        for(MenuItem item: menuItems)
//            totalCost += item.getCost();
        return menuItems.stream().mapToInt(MenuItem::getCost).sum();
    }

    @Override               // SOLID???
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {
        return;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return cost == menuItem.cost && Objects.equals(menuItems, menuItem.menuItems) && Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItems, cost, name, description);
    }
}
