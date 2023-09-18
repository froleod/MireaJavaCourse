package ru.mirea.prak9;

public class Leg {
    private int countOfLegs;

    public Leg(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    @Override
    public String toString() {
        return "countOfLegs=" + countOfLegs;
    }
}
