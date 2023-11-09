package ru.mirea.prak22.Task2;

public class Client {
    Chair chair;

    public void sit() {
        if (chair instanceof FunctionalChair) {
            System.out.println(((FunctionalChair) chair).sum(4, 5));
        } else if (chair instanceof MagicChair) {
            System.out.println(((MagicChair) chair).doMagic());
        } else if (chair instanceof VictorianChair) {
            System.out.println(((VictorianChair) chair).getAge());
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
