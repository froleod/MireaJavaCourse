package ru.mirea.prak19;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static <E> ArrayList<E> Convertion(E[] array, ArrayList<E> arrayList){
        arrayList.addAll(Arrays.asList(array));
        return arrayList;
    }


    public static void main(String[] args) {
        Integer[] array = {3, -2, 5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(Convertion(array, arrayList));

        String[] str = {"abc", "def", "gh"};
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(Convertion(str, strings));

    }
}
