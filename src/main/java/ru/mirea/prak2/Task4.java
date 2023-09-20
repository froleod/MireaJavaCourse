package ru.mirea.prak2;

import java.util.Arrays;

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
        Arrays.sort(arr);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
