package ru.mirea.prak14;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element){
        if(queue.size() + 1 > capacity) {
            System.out.println("Список заполнен. Вы не можете больше добавлять элементы :/");
            return;
        }
        queue.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", queue= " + queue + "}";
    }
}
