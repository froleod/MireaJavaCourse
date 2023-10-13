package ru.mirea.prak19;


public class HandlerAnyTypeArray<T> {
    private T[] array;

    public HandlerAnyTypeArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Индекс за пределами массива");
        }
    }

    public T getElementByInd(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс за пределами массива");
        }
    }

    public int size() {
        return array.length;
    }

    public void print() {
        for (T item : array) {
            System.out.println(item);
        }
    }


    public static void main(String[] args) {
        HandlerAnyTypeArray<Integer> integerArray = new HandlerAnyTypeArray<>(3);
        integerArray.set(0, 4);
        integerArray.set(1, 6);
        integerArray.set(2, -2);

        integerArray.print();


        HandlerAnyTypeArray<String> stringArray = new HandlerAnyTypeArray<>(2);
        stringArray.set(0, "qw");
        stringArray.set(1, "gh");
        stringArray.print();

    }
}
