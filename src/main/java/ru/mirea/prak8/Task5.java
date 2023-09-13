package ru.mirea.prak8;

public class Task5 {
    public static void main(String[] args) {
        int n = 7;
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
