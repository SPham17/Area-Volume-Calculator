package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeFunctions extends JFrame{

    public VolumeFunctions(){
        super("Steven's Volume Calculator™");

        setSize(400, 400);


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Here is our heading
        JLabel heading = new JLabel("You have chosen the volume option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        // Here is our prompt
        JLabel promptName = new JLabel("Volume Of a Revolution: ");

        JLabel M = new JLabel("Please enter your slope: ");
        JTextField slope = new JTextField(12);

        JLabel B = new JLabel("Please enter your y - intercept: ");
        JTextField yint = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField D1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField D2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the amount of iterations: ");
        JTextField N = new JTextField(12);

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
        add(D1);
        add(DomainHigh);
        add(D2);
        add(Accuracy);
        add(N);
        add(promptName);
        add(buttonVolume);
        add(VolumeDisplay);

        buttonVolume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // First we define double variables.
                double m, b, d1, d2, n, dradius, height, circum, radius, volume;
                // We have to parse the text to a type double.
                m = Double.parseDouble(slope.getText());
                b = Double.parseDouble(yint.getText());
                d1 = Double.parseDouble(D1.getText());
                d2 = Double.parseDouble(D2.getText());
                n = Double.parseDouble(N.getText());

                volume = 0;

                // Now we can perform the equation
                for (double x = 0; x < n; x++) {

                    // distance between the shells. divided by number of shells to ensure they are even
                    dradius = (d2 - d1) / n;

                    // finds radius of the shell, finds new radius depending on which shell iteration it is.
                    radius = d2 - dradius * x;

                    // finds height, height differs in each shell, uses a different radius in different iterations
                    height = m * radius + b;

                    // finds circumference, circuference differs in each shell, uses a different radius in different iterations
                    circum = 2 * Math.PI * radius;

                    // finds volume of the shell with previously calculated data, adds to total volume
                    volume += Math.abs(dradius * height * circum);

                    // repeat until reaches number of shells / iterations
                    // end of for loop

                    // We will now pass the value of result to jTextField3.
                    // At the same time, we are going to
                    // change the value of result from a float to a string.
                    VolumeDisplay.setText(String.valueOf(volume));
                }

            }
        });
            }
    }


