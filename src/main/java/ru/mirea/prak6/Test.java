package ru.mirea.prak6;

public class Test {
    public static void main(String[] args) {
        Pan pan = new Pan(true, true, "black");
        Plate plate = new Plate(true, false, "white");
        System.out.println(pan.getColor());
        System.out.println(pan.isWithAHandle());
        System.out.println(plate.isDeep());
    }
}
