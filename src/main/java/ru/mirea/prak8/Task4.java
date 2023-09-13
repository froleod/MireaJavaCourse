package ru.mirea.prak8;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int []arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        arr = Arrays.stream(arr).sorted().toArray();

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
