package ru.mirea.prak24;

public final class Dish extends MenuItem {

    private final double dishCost;
    private final String dishName;
    private final String dishDescription;

    public Dish(int dishCost, String dishName, String dishDescription) {
        this.dishCost = dishCost;
        this.dishName = dishName;
        this.dishDescription = dishDescription;
    }

    public Dish(String dishName, String dishDescription) {
        this.dishCost = 0;
        this.dishName = dishName;
        this.dishDescription = dishDescription;
    }

}
