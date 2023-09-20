package ru.mirea.prak2;

public class whileSum {
    int[]arr;
    public whileSum(int[]arr) {
        this.arr = arr;
    }
    public static void whileSumArr(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
