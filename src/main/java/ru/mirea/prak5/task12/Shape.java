package ru.mirea.prak5.task12;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    abstract String getColor();

    abstract void setColor(String color);


    abstract boolean isFilled();


    abstract void setFilled(boolean filled);


    abstract double getArea();
    abstract double getPerimeter();


}
