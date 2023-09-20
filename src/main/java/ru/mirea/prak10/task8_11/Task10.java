package ru.mirea.prak10.task8_11;

public class Task10 {

    public static int reverseNumber(int n) {
        return rev(n, 0);
    }

    public static int rev(int n, int reversed) {
        if (n == 0)
            return reversed;
        else {
            int lastDigit = n % 10;
            int newReversed = reversed * 10 + lastDigit;
            int remainDigits = n / 10;
            return rev(remainDigits, newReversed);
        }
    }

    public static void main(String[] args) {
        int num = 267;
        System.out.println(reverseNumber(num));
    }
}
