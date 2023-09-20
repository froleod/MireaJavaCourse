package ru.mirea.prak10.task8_11;

import java.util.Scanner;

public class Task8 {

    public static String palindrome(String s){
        int len = s.length();
        if(len <= 1)
            return "THIS WORD IS PALINDROME";
        else if (s.charAt(0) != s.charAt(len - 1)) {
            return "THIS WORD ISN'T PALINDROME";
        }
        else{
            String newString = s.substring(1, len - 1);
            return palindrome(newString);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = scanner.nextLine().toLowerCase();

        System.out.println(palindrome(word));

    }
}
