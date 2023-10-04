package ru.mirea.prak13;

import java.io.FileWriter;
import java.io.IOException;

public class Task1_FileWrite {
    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("C:\\Users\\main\\IdeaProjects\\mirea\\prak0409\\src\\main\\" +
                "java\\ru\\mirea\\prak13\\file.txt", false)){ // append:true для 3 задания
            String text = "some text to write in file 2";
            writer.write(text);
            writer.append('\n');

            writer.flush();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
