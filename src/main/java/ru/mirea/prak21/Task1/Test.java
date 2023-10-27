package ru.mirea.prak21.Task1;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(10);
        ArrayQueueModule.enqueue(3);
        ArrayQueueModule.enqueue(-5);
        ArrayQueueModule.dequeue();
        System.out.println(ArrayQueueModule.element());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());

        System.out.println("------------------------------------");

        ArrayQueueATD queueATD = new ArrayQueueATD();
        ArrayQueueATD.enqueue(queueATD, 4);
        ArrayQueueATD.enqueue(queueATD, 8);
        ArrayQueueATD.enqueue(queueATD, -12);
        ArrayQueueATD.enqueue(queueATD, 66);
        System.out.println("size: " + ArrayQueueATD.size(queueATD));
        ArrayQueueATD.dequeue(queueATD);
        System.out.println("size: " + ArrayQueueATD.size(queueATD));

        System.out.println("------------------------------------");

        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("size: " + queue.size());
        queue.clear();
        System.out.println("size: " + queue.size());



    }
}
