package ru.mirea.prak10;

public class Pan extends Dish{

    private boolean withAHandle;

    public Pan(boolean withAHandle, boolean isClear, String color) {
        this.withAHandle = withAHandle;
        this.isClear = isClear;
        this.color = color;
    }

    public boolean isWithAHandle() {
        return withAHandle;
    }

    public void setWithAHandle(boolean withAHandle) {
        this.withAHandle = withAHandle;
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
