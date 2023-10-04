package ru.mirea.prak13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2_Output {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\main\\IdeaProjects\\mirea\\prak0409\\src\\main\\java\\ru\\mirea\\prak13\\file2.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
