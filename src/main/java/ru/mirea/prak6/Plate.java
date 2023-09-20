package ru.mirea.prak6;

public class Plate extends Dish{
    private boolean isDeep;

    public Plate(boolean isDeep, boolean isClear, String color) {
        this.isDeep = isDeep;
        this.isClear = isClear;
        this.color = color;
    }

    public boolean isDeep() {
        return isDeep;
    }

    public void setDeep(boolean deep) {
        isDeep = deep;
    }

    @Override
    boolean isClear() {
        return this.isClear;
    }

    @Override
    void setClear(boolean isClear) {
        this.isClear = isClear;
    }

    @Override
    void setColor(String color) {
        this.color = color;
    }

    @Override
    String getColor() {
        return this.color;
    }
}
