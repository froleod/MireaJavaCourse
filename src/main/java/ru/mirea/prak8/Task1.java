package ru.mirea.prak8;

public class Task1 {
    public static void main(String[] args) {
        int []arr = {5, 8, 0, -1, 5, 1};
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println("sum = " + sum);
        sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println("sum = " + sum);
        sum = 0;
        i = 0;
        do{
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("sum = " + sum);


    }
}
