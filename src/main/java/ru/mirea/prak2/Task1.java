package ru.mirea.prak2;


import static ru.mirea.prak2.doWhileSum.doWhileSumArr;
import static ru.mirea.prak2.forSum.forSumArr;
import static ru.mirea.prak2.whileSum.whileSumArr;

public class Task1 {
    public static void main(String[] args) {
        int []arr = new int[]{5, 0, -2, 6, 12};

        doWhileSumArr(arr);
        whileSumArr(arr);
        forSumArr(arr);

    }
}
