package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaFunctions extends JFrame{

    public void Area(){
        setSize(400, 400);

        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Here is our heading
        JLabel heading = new JLabel("You have chosen the area option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        // Here is our prompt
        JLabel promptName = new JLabel("Volume Of a Revolution: ");

        JLabel M = new JLabel("Please enter your slope: ");
        JTextField slope = new JTextField(12);

        JLabel B = new JLabel("Please enter your y - intercept: ");
        JTextField yint = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField d1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField d2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the amount of iterations: ");
        JTextField n = new JTextField(12);

        // Here is our button
        JButton buttonVolume = new JButton("Calculate Volume!");

        JTextField VolumeDisplay = new JTextField(12);

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(M);
        add(slope);
        add(B);
        add(yint);
        add(DomainLow);
        add(d1);
        add(DomainHigh);
        add(d2);
        add(Accuracy);
        add(n);
        add(promptName);
        add(buttonVolume);
        add(VolumeDisplay);

        buttonVolume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // First we define double variables.
                double m, b, d1, d2, n, dradius, Volume;
                // We have to parse the text to a type double.
                m = Double.parseDouble(slope.getText());
                b = Double.parseDouble(yint.getText());
                d1 = Double.parseDouble(DomainLow.getText());
                d2 = Double.parseDouble(DomainLow.getText());
                n = Double.parseDouble(Accuracy.getText());

            }
        });

        buttonVolume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


    }


}


