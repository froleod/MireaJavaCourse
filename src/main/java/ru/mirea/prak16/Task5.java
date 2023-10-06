package ru.mirea.prak16;

public class Task5 {
    public static void main(String[] args) {
        getDetails(null);
    }

    public static void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in details");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
