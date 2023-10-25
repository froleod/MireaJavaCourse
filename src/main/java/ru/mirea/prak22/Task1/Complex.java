package ru.mirea.prak22.Task1;

public class Complex {

    private int real;
    private int image;

    public Complex() {
        System.out.println("No args constructor");
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
        System.out.println("Args constructor");
    }
}
