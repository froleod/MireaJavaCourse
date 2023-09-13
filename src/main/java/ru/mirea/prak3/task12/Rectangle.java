package ru.mirea.prak3.task12;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
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

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width + ", length=" + length +
                '}';
    }
}
