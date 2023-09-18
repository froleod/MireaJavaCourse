package ru.mirea.prak8;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
