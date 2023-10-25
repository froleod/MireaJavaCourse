package ru.mirea.prak22.Task2;

public class Test {
    public static void main(String[] args) {

//        ChairFactory chairFactory = Client.set

        Client chair = new Client();
        chair.setChair(new MagicChair());
        chair.sit();

        System.out.println(chair);
    }
}
