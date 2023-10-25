package ru.mirea.prak21;

public class ArrayQueueModule {
    private static final int SIZE = 5;
    private int items[] = new int[SIZE];
    private int front, rear;

    public ArrayQueueModule() {
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        return front == 0 && rear == SIZE - 1;
    }

    public void enqueue(int element){
        if(isFull())
            System.out.println("Queue is full :(");
        else{
            if(front == -1)
                front = 0;
            items[++rear] = element;
            System.out.println("Inserted: " + element);
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty :(");
            return -1;
        }
        else{
            int element = items[front];
            System.out.println(element);
            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else
                front++;
            System.out.println(element + " deleted");
            System.out.println(front);
            return items[front-1];
        }
    }

    public int element(){
        if(isEmpty()){
            System.out.println("Queue is empty :(");
            return -1;
        }
        else{
            System.out.println(front + " " + items[front]);
            return items[front];
        }
    }

    public int size(){
        int cnt = 0;
        for(int i: items)
            if(i != 0)
                cnt++;
        return cnt;
    }

    public void clear(){
        front = -1;
        rear = -1;
    }

    boolean isEmpty(){
        return front == -1;
    }



}
