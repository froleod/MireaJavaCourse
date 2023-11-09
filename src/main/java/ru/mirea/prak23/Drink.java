package ru.mirea.prak23;

public final class Drink implements Item {

    private final double drinkCost;
    private final String drinkName;
    private final String drinkDescription;

    public Drink(int drinkCost, String drinkName, String drinkDescription) {
        this.drinkCost = drinkCost;
        this.drinkName = drinkName;
        this.drinkDescription = drinkDescription;
    }

    public Drink(String drinkName, String drinkDescription) {
        this.drinkCost = 0;
        this.drinkName = drinkName;
        this.drinkDescription = drinkDescription;
    }

    @Override
    public double getItemCost() {
        return this.drinkCost;
    }

    @Override
    public String getItemName() {
        return this.drinkName;
    }

    @Override
    public String getItemDescription() {
        return this.drinkDescription;
    }
}
