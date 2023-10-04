package ru.mirea.prak2;

public class doWhileSum {

    int[]arr;
    public doWhileSum(int[]arr) {
        this.arr = arr;
    }

    public static void doWhileSumArr(int[] arr) {
        int sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("doWhile sum = " + sum);
    }
}
