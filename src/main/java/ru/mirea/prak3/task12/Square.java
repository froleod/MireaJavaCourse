package ru.mirea.prak3.task12;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public void setSide(double side) {
        super.setLength(length);
        super.setWidth(length);
    }

    public double getSide() {
        return length;
    }

    @Override
    public String toString() {
        return "Square{" + "width=" + width +
                ", length=" + length + '}';
    }
}
