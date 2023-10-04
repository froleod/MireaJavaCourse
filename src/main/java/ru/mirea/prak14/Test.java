package ru.mirea.prak14;

public class Test {
    public static void main(String[] args) {
        UnfairWaitList<Integer> list = new UnfairWaitList<>();
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(8);


        System.out.println(list);
        list.remove(7);

        System.out.println("Пробуем добавить 7...");
        list.add(7);

        System.out.println(list);

        BoundedWaitList<String> bwt = new BoundedWaitList<>(3);
        bwt.add("str1");
        bwt.add("str2");
        bwt.add("str3");

        bwt.add("str4");

        System.out.println(bwt);

    }
}
