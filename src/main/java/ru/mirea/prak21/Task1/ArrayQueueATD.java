package ru.mirea.prak21.Task1;

// Очередь представляет собой упорядоченную коллекцию элементов, в которой элементы добавляются в конец (хвост) и
// извлекаются из начала (голова).
// Очередь не позволяет извлекать элементы из середины или произвольного места внутри структуры данных,
// а только из начала очереди.
// При добавлении элементов в очередь, они добавляются в конец очереди, и при извлечении элементов, они извлекаются
// из начала очереди.
// Очередь может быть ограниченной (ограниченной по размеру), и в этом случае при попытке добавления элемента
// в полную очередь может возникнуть ошибка.
// Очередь может быть реализована как FIFO (First-In, First-Out) структура, где элементы обрабатываются в порядке,
// в котором они были добавлены.
// Очередь может быть реализована как потокобезопасная структура данных, если несколько потоков могут одновременно
// добавлять и извлекать элементы из очереди.

// enqueue:
// Предусловие: Очередь существует и может принимать элементы.
// Постусловие: Элемент успешно добавлен в конец очереди.

// element:
// Предусловие: Очередь не пуста.
// Постусловие: Возвращен первый элемент в очереди (элемент не удаляется).

// dequeue:
// Предусловие: Очередь не пуста.
// Постусловие: Первый элемент успешно удален из очереди и возвращен.

// size:
// Предусловие: Очередь существует.
// Постусловие: Возвращен текущий размер очереди.

// isEmpty:
// Предусловие: Очередь существует.
// Постусловие: Возвращено true, если очередь пуста, и false, если в очереди есть элементы.

// clear:
// Предусловие: Очередь существует.
// Постусловие: Все элементы успешно удалены из очереди, и очередь становится пустой.


public class ArrayQueueATD {
    private static Object[] elements = new Object[5];
    private int size;
    private int head;
    private int tail;

    public static void enqueue(ArrayQueueATD queue, Object item) {
        if (queue.size == elements.length)
            System.out.println("Queue is full :(");
        else {
            elements[queue.tail] = item;
            queue.tail = (queue.tail + 1) % elements.length;
            queue.size++;
            System.out.println("Inserted: " + item);
        }
    }

    public static Object dequeue(ArrayQueueATD queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty :(");
            return -1;
        } else {

            Object item = elements[queue.head];
            elements[queue.head] = null;

            queue.head = (queue.head + 1) % elements.length;
            queue.size--;

            System.out.println(item + " deleted");

            return item;
        }
    }

    public static Object element(ArrayQueueATD queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is empty :(");
            return -1;
        } else {
            return elements[queue.head];
        }
    }

    public static int size(ArrayQueueATD queue) {
        if(queue != null)
            return queue.size;
        return -1;
    }

    public static void clear(ArrayQueueATD queue) {
        elements = new Object[5];
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }

    static boolean isEmpty(ArrayQueueATD queue) {
        if(queue != null)
            return queue.size == 0;
        return false;
    }

}
