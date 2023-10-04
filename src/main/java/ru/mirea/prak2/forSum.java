package ru.mirea.prak2;

public class forSum {
    int[]arr;
    public forSum(int[]arr) {
        this.arr = arr;
    }
    public static void forSumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println("for sum = " + sum);
    }
}
