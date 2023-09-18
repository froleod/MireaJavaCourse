package ru.mirea.prak11;

public class Test{
    public static void main(String[] args) {
        Book book1 = new Book(190, "Book1");
        Car car1 = new Car(499999, "BMW");
        System.out.println(car1.getPrice());
        System.out.println(book1.getPrice());
    }
}
