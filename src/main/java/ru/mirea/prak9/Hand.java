package ru.mirea.prak9;

public class Hand {
    private int countOfHands;

    public Hand(int countOfHands) {
        this.countOfHands = countOfHands;
    }

    public int getCountOfHands() {
        return countOfHands;
    }

    public void setCountOfHands(int countOfHands) {
        this.countOfHands = countOfHands;
    }

    @Override
    public String toString() {
        return "countOfHands=" + countOfHands;
    }
}
