package ru.mirea.prak3;

import ru.mirea.prak3.task12.Circle;
import ru.mirea.prak3.task12.Rectangle;
import ru.mirea.prak3.task12.Square;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getRadius());
        c.setRadius(10);
        System.out.println(c.getRadius());

        Rectangle r = new Rectangle(5, 7);
        System.out.println(r.getArea());

        Square s = new Square();
        s.setSide(4);
        System.out.println(s.getPerimeter());
    }
}
