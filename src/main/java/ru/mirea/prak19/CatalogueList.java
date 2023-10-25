package ru.mirea.prak19;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CatalogueList {

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\main\\IdeaProjects\\mirea\\prak0409\\src\\main\\java\\ru\\mirea\\prak10";

        List<String> fileList = new ArrayList<>();

        try {
            Path dirPath = Paths.get(directoryPath);

            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dirPath)) {
                for (Path path : directoryStream) {
                    fileList.add(path.getFileName().toString());
                    try (DirectoryStream<Path> childDirectory = Files.newDirectoryStream(path)) {
                        for (Path path2 : childDirectory) {
                            fileList.add(path2.getFileName().toString());
                        }
                    }
                }

            }

            int count = 0;
            for (String fileName : fileList) {
                System.out.println(fileName);
                count++;
                if (count >= 5) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
