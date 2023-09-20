package ru.mirea.prak5.task12;

public class Circle extends Shape{

    protected double radius;

    public Circle() {
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    void setColor(String color) {
        this.color = color;
    }

    @Override
    boolean isFilled() {
        return filled;
    }

    @Override
    void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
