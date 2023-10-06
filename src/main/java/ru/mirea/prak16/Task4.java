package ru.mirea.prak16;

import java.util.Scanner;

public class Task4 {
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
        finally {
            System.out.println("'finally' defines code that’s always run after the try and any catch block, before " +
                    "the method is completed.");
        }
    }
}
