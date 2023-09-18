package ru.mirea.prak9;

public class Test {
    public static void main(String[] args) {
        Head head = new Head(1);
        Hand hands = new Hand(2);
        Leg legs = new Leg(2);
        Human man = new Human(head, legs, hands, "Ivan", 16);
        System.out.println(man.getHead());
        System.out.println(man.getAge());
        man.setAge(17);
        System.out.println(man);


    }
}
