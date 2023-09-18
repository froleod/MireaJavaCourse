package ru.mirea.prak9;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    private String name;
    private int age;

    public Human(Head head, Leg leg, Hand hand, String name, int age) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
        this.name = name;
        this.age = age;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                head +
                ", " + leg +
                ", " + hand +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
