package ru.mirea.prak8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JFrame {

    private BufferedImage image;
    private JLabel imageLabel;

    public DisplayImage(String imagePath) {
        try {
            this.image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        setTitle("Фото");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // создаем JLabel и устанавливаем иконку
        imageLabel = new JLabel(new ImageIcon(image));
        getContentPane().add(imageLabel, BorderLayout.CENTER);

        pack(); // устанавливаем размер окна, чтобы он соответствовал размеру изображения
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Вы не указали путь к изображению");
            System.exit(1);
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(() -> {
            DisplayImage displayImage = new DisplayImage(imagePath);
            displayImage.setVisible(true);
        });
    }
}
