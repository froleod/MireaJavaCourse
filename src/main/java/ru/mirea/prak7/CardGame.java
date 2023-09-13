package ru.mirea.prak7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        int k = 0;
        String deck1, deck2;
        deck1 = in.next();
        deck2 = in.next();
        for (int i = 0; i < 5; i++)
            player1.add(Integer.parseInt(String.valueOf(deck1.charAt(i))));
        for (int i = 0; i < 5; i++)
            player2.add(Integer.parseInt(String.valueOf(deck2.charAt(i))));
        while ((!player1.isEmpty() && !player2.isEmpty()) && k != 106) {
            k++;
            int a = player1.getFirst(), b = player2.getFirst();
            if ((a > b || a == 0 && b == 9) && !(a == 9 && b == 0)) {
                player1.add(a);
                player1.add(b);
            } else {
                player2.add(a);
                player2.add(b);
            }
            player1.pop();
            player2.pop();
        }
        if (player1.isEmpty())
            System.out.println("second " + k);
        else if (player2.isEmpty())
            System.out.println("first " + k);
        else
            System.out.println("botva");

    }
}
