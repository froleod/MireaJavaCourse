package ru.mirea.prak22.Task1;

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory abstractFactory = new ConcreteFactory();
        Complex complex = abstractFactory.CreateComplex(10, 20);
    }
}
