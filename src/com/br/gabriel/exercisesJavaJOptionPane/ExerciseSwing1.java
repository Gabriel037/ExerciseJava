package com.br.gabriel.exercisesJavaJOptionPane;

import javax.swing.*;
import java.awt.*;

public class ExerciseSwing1 {
    public static void main(String[] args) {
        // Exiba o painel principal em um JFrame
        JFrame frame = new JFrame("Idade em Dias");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setLocationRelativeTo(null);

        JLabel title = new JLabel("Calular seu tempo de vida em dias!!!");

        // Crie um modelo de SpinnerNumberModel com valor inicial, mínimo, máximo e incremento
        SpinnerNumberModel spinnerYearModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        SpinnerNumberModel spinnerMonthModel = new SpinnerNumberModel(0, 0, 11, 1);
        SpinnerNumberModel spinnerDayModel = new SpinnerNumberModel(0, 0, 31, 1);

        // Crie os JSpinners com os modelos
        JSpinner spinnerYear = new JSpinner(spinnerYearModel);
        JSpinner spinnerMonth = new JSpinner(spinnerMonthModel);
        JSpinner spinnerDay = new JSpinner(spinnerDayModel);

        // Crie rótulos para os JSpinners
        JLabel yearLabel = new JLabel("Anos");
        JLabel monthLabel = new JLabel("Mês");
        JLabel dayLabel = new JLabel("Dia");

        // Crie um painel para conter os rótulos e spinners usando GridBagLayout
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Adicione 5px de espaçamento

        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(yearLabel, gbc);

        gbc.gridx = 1;
        inputPanel.add(spinnerYear, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(monthLabel, gbc);

        gbc.gridx = 1;
        inputPanel.add(spinnerMonth, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(dayLabel, gbc);

        gbc.gridx = 1;
        inputPanel.add(spinnerDay, gbc);

        //Crie um botão
        JButton button = new JButton("Calcular");
        button.setPreferredSize(new Dimension(80, 28));

        button.addActionListener(e -> {
            int year = (int) spinnerYear.getValue();
            int month = (int) spinnerMonth.getValue();
            int day = (int) spinnerDay.getValue();
            int totalDias = (year * 365) + (month * 30) + day;
            JOptionPane.showMessageDialog(frame, totalDias + " Dias de vida");
        });

        // Painel principal com GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(title, gbc);

        gbc.gridy = 1;
        mainPanel.add(inputPanel, gbc);

        gbc.gridy = 2;
        mainPanel.add(button, gbc);

        // Adicionando painel principal ao frame
        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }
}
