package ru.mirea.prak4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FootballMatchApp extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private Label winnerLabel;

    public FootballMatchApp() {
        setTitle("Football Match");
        setSize(300, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // для остановки работы проекта при закрытии окна

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new Label("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });

        mainPanel.add(milanButton);
        mainPanel.add(madridButton);
        mainPanel.add(resultLabel);
        mainPanel.add(lastScorerLabel);
        mainPanel.add(winnerLabel);

        add(mainPanel);
    }

    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FootballMatchApp app = new FootballMatchApp();
                app.setVisible(true);
            }
        });
    }
}

