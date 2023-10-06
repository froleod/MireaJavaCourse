package ru.mirea.prak16;

import java.util.Objects;
import java.util.Scanner;

public class Task8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try{                    // TODO: Добавьте цикл к getKey() таким образом, чтобы пользователь получил
                                // TODO: еще один шанс на ввод значение ключа
            printDetails(key);
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
