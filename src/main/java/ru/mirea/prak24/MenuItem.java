package ru.mirea.prak24;

import java.util.LinkedList;

public class MenuItem {

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

}
