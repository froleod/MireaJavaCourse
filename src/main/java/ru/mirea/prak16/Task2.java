package ru.mirea.prak16;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        try {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
