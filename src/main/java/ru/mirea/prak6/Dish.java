package ru.mirea.prak6;

public abstract class Dish {
    boolean isClear;
    String color;

    abstract boolean isClear();
    abstract void setClear(boolean isClear);
    abstract void setColor(String color);
    abstract String getColor();
}
