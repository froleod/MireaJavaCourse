package ru.mirea.prak9;

public class Head {
    int countOfHeads;

    public Head(int countOfHeads) {
        this.countOfHeads = countOfHeads;
    }

    public int getCountOfHeads() {
        return countOfHeads;
    }

    public void setCountOfHeads(int countOfHeads) {
        this.countOfHeads = countOfHeads;
    }

    @Override
    public String toString() {
        return "countOfHeads=" + countOfHeads;
    }
}
