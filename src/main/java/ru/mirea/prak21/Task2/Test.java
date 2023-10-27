package ru.mirea.prak21.Task2;

public class Test {
    public static void main(String[] args) {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();

        linkedQueue.add("qwerty");
        linkedQueue.add("asdf");
        linkedQueue.add("zxcvb");

        System.out.println(linkedQueue.peek());
        System.out.println(linkedQueue);

        System.out.println(linkedQueue.poll());
        System.out.println(linkedQueue);
    }
}
