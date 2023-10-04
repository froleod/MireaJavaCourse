package ru.mirea.prak14;

import java.util.ArrayList;

public class UnfairWaitList<E> extends WaitList<E> {
    private ArrayList<E> removedElements = new ArrayList<>();

    public UnfairWaitList() {
    }

    public void remove(E element){
        if(queue.peek() != element) {
            queue.remove(element);
            removedElements.add(element);
        }
    }

    @Override
    public void add(E element) {
        if(!removedElements.contains(element)){
            queue.add(element);
        }
        else{
            System.out.println("Ошибка. Нельзя добавить удаленный элемент :/");
        }
    }
}
