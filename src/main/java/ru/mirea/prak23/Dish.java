package ru.mirea.prak23;

public final class Dish implements Item {

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

    @Override
    public double getItemCost() {
        return this.dishCost;
    }

    @Override
    public String getItemName() {
        return dishName;
    }

    @Override
    public String getItemDescription() {
        return dishDescription;
    }
}
