package ru.mirea.prak13;

import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\main\\IdeaProjects\\mirea\\prak0409\\src\\main\\java\\ru\\mirea\\prak13\\file4.txt", true)) {
            String newtext = "new text in file4";
            writer.append('\n');

            writer.write(newtext);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
