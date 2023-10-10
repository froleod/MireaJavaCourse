package ru.mirea.prak17;

public class Test {
    public static void main(String[] args) {
        String surname = "Frolov", inn = "inn1";
        try{
            validateInn("inn");
        }
        catch (validInnNumberException e){
            System.out.println(e.getMessage());
        }
    }

    public static void validateInn(String inn) throws validInnNumberException {
        if(inn.length() < 5)
            throw new validInnNumberException("Inn is not valid, try again :/");
        System.out.println("yep, INN is valid! ");
    }

}
