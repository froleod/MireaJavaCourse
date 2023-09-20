package ru.mirea.prak10.task8_11;

public class Task7 {

    public static void main(String[] args) {
        int n = 144;
        primeFactors(n, 2);
    }

    public static void primeFactors(int n, int divisor) {
        if (n <= 1)
            return;
        if (n % divisor == 0) {
            System.out.println(divisor + " ");
            primeFactors(n / divisor, divisor);
        } else {
            primeFactors(n, divisor + 1);
        }
    }


}
